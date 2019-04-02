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