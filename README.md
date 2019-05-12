# spring
Learning spring

##### What is Inversion Of Control (IoC) ?
IoC is the outsourcing the creation and management of object to an external object builder factories.

##### What is Dependency Injection (DI) ?
DI is the outsourcing of creation and injection of dependencies to an external object building factories.

##### Spring Bean
The java object created and managed by spring container is called spring bean.

##### DI types
- Constructor injection
- Setter injection

##### Constructor injection
constructor injection is used to inject object dependency through constructor agrument
In below example dependency *laFerrari* is injected in object *carRacingGame* using constructor argument 
```xml
<bean id="laFerrari" class="spring.di.constructor.bean.LaFerrari" />
<bean id="carRacingGame" class="spring.di.constructor.bean.CarRacingGame">
	<constructor-arg ref="laFerrari" />
</bean>
```
##### Setter injection
Setter injection is used to inject object dependency through setter methods
In below example dependency *laFerrari* is injected in object *carRacingGame* using setter method

Injecting primitive values
```xml
<bean id="laFerrari" class="spring.di.constructor.bean.LaFerrari">
	<property name="engine" value="6.3" />
	<property name="class" value="sport" />
</bean>
```
Injecting primitive values, read values from properties file
```xml
<context:property-placeholder location="classpath:car.properties" />
<bean id="laFerrari" class="spring.di.constructor.bean.LaFerrari">
	<property name="engine" value="${LaFerrari.engine}" />
	<property name="class" value="${LaFerrari.class}" />
</bean>
```
Injecting object reference
```xml
<bean id="laFerrari" class="spring.di.constructor.bean.LaFerrari" />
<bean id="carRacingGame" class="spring.di.constructor.bean.CarRacingGame">
	<property name="car" ref="laFerrari" />
</bean>
```
#### Bean Scope
| Scope         | Description                                                                                     |
| ------------- |:-----------------------------------------------------------------------------------------------:|
| Singleton     | Spring container creates single bean and used throughout the application, This is default scope |
| Prototype     | Every time bean is requested to the spring container centered, it creates new bean and return   |
| Request       | The bean scope is to the HTTP request, Valid in web application                                 |
| Session       | The bean scope is to the HTTP session, Valid in web application                                 |
| Global Session| The bean scope is to the global HTTP session, Valid in web application                          |

#### Spring configuration using annotation
##### Why should one use annotation to configure spring instead of XML configuration
- To minimize the configuration from XML file

#### Enable annotation based configuration
```XML
	<!-- Enable component scanning -->
	<context:component-scan base-package="spring.annotation.ioc" />
```
#### @Component
Component annotation is used for class
If spring perform component scanning it will look for the classes with annotation @Component.
If it found the class with annotation @Component then spring creates the bean for it and make it available through spring container
You can name your bean by passing name to @Component 
```Java
@Component("laFerrari")
class LaFerrari extends Car {
	/* LaFerrari specific implementation */
}
```
#### Bean with default name
When you use @Component, spring will create a bean with default name.
Such as if you mark class Car with @Component then spring will create a bean for class Car with name 'car'.
Here to create default name spring follows below steps
- Take the class name.
- Change the case of first letter and make it lowercase.
- If the first two letters are uppercase, then do not change the case of first letter and use class name as bean name.
```Java
// Here bean name for class Car will be 'car'
@Component
class Car {
        /*Car specific implementation*/
    }
}
```
```Java
// Here bean name for class IDGenerator will be 'IDGenerator'
@Component
class IDGenerator {
        /*IDGenerator specific implementation*/
    }
}
```
#### @Autowired, Dependency injection using annotation
Using @Autowired, you tell spring to configure dependencies automatically for you.
When spring finds dependency marked by @Autowired, It gets the dependency from spring container and inject it.
We can use @Autowired to inject(wire) dependencies using 'Constructor injection, Setter injection and Field injection'

##### Constructor injection
Annotate your constructor with @Autowired annotation
```Java
@Component
public class CarRacingGame {
	private Car car;
	@Autowired
	public CarRacingGame(final Car car) {
		this.car = car;
	}
}
```
##### Setter injection
Annotate your setter method with with @Autowired annotation
```Java
@Component
public class CarRacingGame {
	private Car car;
	@Autowired
	public void setCar(final Car car) {
		this.car = car;
	}
}
```
##### Field injection
Annotate your field with @Autowired annotation
```Java
@Component
public class CarRacingGame {
    @Autowired
	private Car car;
}
```
#### @Qualifier
When you use @Autowired to wire your dependencies, Spring search the bean(dependency) by type. 
Like your code is using @Autowired to inject Car dependency, Spring will search for bean of type Car or it's implementation in spring container
But what if the dependency has multiple implementations? How spring will decide which implementation to choose?
@Qualifier help spring to choose the implementation
Using @Qualifier annotation you set the preference which tells spring which implementation to choose while autowiring.
In below code we are wiring dependency Car, here we have multiple implementations of Car but using @Qualifier we are giving preference to FerrariMonzaSP2 
```Java
@Component
class Car {
	/* Car implementation */
}

@Component
class FerrariMonzaSP1 extends Car {
	/* FerrariMonzaSP1 specific implementation */
}

@Component
class FerrariMonzaSP2 extends Car {
	/* FerrariMonzaSP2 specific implementation */
}

@Component
public class CarRacingGame {
	private Car car;
	@Autowired
	@Qualifier("ferrariMonzaSP2")
	public void setCar(final Car car) {
		this.car = car;
	}
}
```
#### Using @Qualifier with constructor injection
When using @Qualifier with constructor injection you need to place @Qualifier before constructor argument.
```Java
@Component
public class CarRacingGame {
	private Car car;
	@Autowired
	public CarRacingGame(final @Qualifier("ferrariMonzaSP2") Car car) {
		this.car = car;
	}
}
```
#### Loading properties from file
To load properties from
Create properties file
```
app.name=CarRacingGame
app.version=2.0
```
Load properties file into spring container
```XML
<context:property-placeholder location="classpath:app.properties"/>
```
Inject properties into bean
```Java
@Component("appProperties")
public class AppProperties {
    @Value("${app.name}")
    private String name;
    
    @Value("${app.version}")
    private String version;
}
```