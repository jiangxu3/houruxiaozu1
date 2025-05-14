<!-- 杨凯迪-->

使用最佳实践的Spring Boot应用开发 - 教练机构管理
我开发了这个应用程序以实现最佳实践和Java 8特性，以及以下模块：

异常处理
事务管理
面向切面编程（AOP）
使用@Qualifier解决自动装配冲突
Spring Security（JWT认证）
单元测试和集成测试
验证
日志记录
可以通过点击此链接从我的GitHub仓库克隆它。

> 先决条件
Java 17
IDE（IntelliJ IDEA）
MySql
Maven 3.0
Git
Postman
演示
初始状态


通过Postman发出POST请求：成功模拟转账


事务永久提交到数据库


向不存在的账户转账：当发生NoSuchElementException时模拟回滚



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
<!-- 杨凯迪-->