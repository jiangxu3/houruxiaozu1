
# Spring Boot Application Development Using Best Practices - Coaching Institute Management

I developed this application to implement best practices and Java 8 features along with the fololwing modules.
* Exception Handling
* Transaction Management
* Aspect Oriented Programming (AOP)
* Autowire Conflict Resolution using @Qualifier
* Spring Security (JWT Authentication)
* Unit and Integration Testing
* Validation
* Logings



Clone it from my github repository by clicking [this link](https://github.com/haffani/spring-transaction-management).

#### > Prerequisites

* Java 17 
* IDE (Intellej IDEA)
* MySql
* Maven 3.0
* Git 
* Postman.

# Demo

#### Initilal state

![Image Alt](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/h2.png)

#### Making a POST request via POSTMAN: simulation of a succesful money transfer

![Image Alt](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/postreq.png)

#### Transaction is commited permanently to database

![Image Alt](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/after.png)

#### Transfer money to an inexistant account: simulation of rollback called when NoSuchElementException is occured

![Image Alt](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/rollbackforcing.png)

#### NoSuchElementException shown in the console

![Image Alt](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/no such elemnt.png)

