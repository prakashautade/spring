# spring
Learning spring

##### What is Inversion Of Control (IoC) ?
IoC is the outsourcing the creation and management of object to an external object builder factories.

##### What is Dependency Injection (DI) ?
DI is the outsourcing of creation and injection of dependencies to an external object building factories.

##### Spring Bean
The java object created and managed by spring container is called spring bean.

##### DI types
- Contsructor injection
- Setter injection

##### Contsructor injection
Contsructor injection is used to inject object dependency through constructor agrument
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
If it found the class with annotation @Component then spring creates the object for it and make it available through spring container