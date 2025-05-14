
1. 核心开发术语
术语	解释	出现位置示例
Maven Wrapper (mvnw)	用于在不预装 Maven 的环境中运行项目的脚本	mvnw 文件
JVM 配置 (jvm.config)	指定 Java 虚拟机的运行参数（如内存设置）	.mvn/jvm.config
Spring Profile	不同环境（如测试、生产）的配置隔离	application-test.properties
JPA (Java Persistence API)	Java 持久化标准，用于数据库操作	spring.jpa.hibernate.ddl-auto
Hibernate Dialect	指定数据库方言（如 MySQL 语法）	MySQL5InnoDBDialect

2. 安全与认证
术语	解释	出现位置示例
JWT (JSON Web Token)	用于身份验证的加密令牌	bezkoder.app.jwtSecret
JWT Expiration	Token 的有效期（毫秒）	bezkoder.app.jwtExpirationMs
AuthenticationEntryPoint	Spring Security 中处理未授权请求的入口	AuthEntryPointJwt
OncePerRequestFilter	确保每个请求只过滤一次的基类	AuthTokenFilter

3. 数据库与持久化
术语	解释	出现位置示例
DDL Auto (ddl-auto)	自动更新数据库表结构（如 update）	spring.jpa.hibernate.ddl-auto
DataSource	数据库连接配置（URL、用户名、密码）	spring.datasource.url
Hibernate Show SQL	控制是否打印 SQL 语句	spring.jpa.show-sql=true

4. 测试相关
术语	解释	出现位置示例
@SpringBootTest	标记为 Spring Boot 集成测试类	SpringBootBestPracticesApplicationTests
JUnit 5	Java 单元测试框架	@Test 注解
Test Profile	测试专用的配置（如内存数据库）	application-test.properties

5. 工具与依赖
术语	解释	出现位置示例
Lombok	通过注解减少样板代码（如 @Getter）	LoginRequest.java
Spring Boot Starter	预配置的依赖模块（如 spring-boot-starter-data-jpa）	pom.xml
Maven Dependency Scope	依赖作用域（如 runtime、test）	mysql-connector-java

6. 其他关键术语
术语	解释	出现位置示例
AOP (Aspect-Oriented Programming)	面向切面编程（如日志、事务）	spring-boot-starter-aop
DTO (Data Transfer Object)	数据传输对象（如 LoginRequest）	LoginRequest.java

1. 核心开发术语
术语	解释	出现位置示例
Maven Wrapper (mvnw)	用于在不预装 Maven 的环境中运行项目的脚本	mvnw 文件
JVM 配置 (jvm.config)	指定 Java 虚拟机的运行参数（如内存设置）	.mvn/jvm.config
Spring Profile	不同环境（如测试、生产）的配置隔离	application-test.properties
JPA (Java Persistence API)	Java 持久化标准，用于数据库操作	spring.jpa.hibernate.ddl-auto
Hibernate Dialect	指定数据库方言（如 MySQL 语法）	MySQL5InnoDBDialect

2. 安全与认证
术语	解释	出现位置示例
JWT (JSON Web Token)	用于身份验证的加密令牌	bezkoder.app.jwtSecret
JWT Expiration	Token 的有效期（毫秒）	bezkoder.app.jwtExpirationMs
AuthenticationEntryPoint	Spring Security 中处理未授权请求的入口	AuthEntryPointJwt
OncePerRequestFilter	确保每个请求只过滤一次的基类	AuthTokenFilter

3. 数据库与持久化
术语	解释	出现位置示例
DDL Auto (ddl-auto)	自动更新数据库表结构（如 update）	spring.jpa.hibernate.ddl-auto
DataSource	数据库连接配置（URL、用户名、密码）	spring.datasource.url
Hibernate Show SQL	控制是否打印 SQL 语句	spring.jpa.show-sql=true

4. 测试相关
术语	解释	出现位置示例
@SpringBootTest	标记为 Spring Boot 集成测试类	SpringBootBestPracticesApplicationTests
JUnit 5	Java 单元测试框架	@Test 注解
Test Profile	测试专用的配置（如内存数据库）	application-test.properties

5. 工具与依赖
术语	解释	出现位置示例
Lombok	通过注解减少样板代码（如 @Getter）	LoginRequest.java
Spring Boot Starter	预配置的依赖模块（如 spring-boot-starter-data-jpa）	pom.xml
Maven Dependency Scope	依赖作用域（如 runtime、test）	mysql-connector-java

6. 其他关键术语
术语	解释	出现位置示例
AOP (Aspect-Oriented Programming)	面向切面编程（如日志、事务）	spring-boot-starter-aop
DTO (Data Transfer Object)	数据传输对象（如 LoginRequest）	LoginRequest.java

1. 核心开发术语
术语	解释	出现位置示例
Maven Wrapper (mvnw)	用于在不预装 Maven 的环境中运行项目的脚本	mvnw 文件
JVM 配置 (jvm.config)	指定 Java 虚拟机的运行参数（如内存设置）	.mvn/jvm.config
Spring Profile	不同环境（如测试、生产）的配置隔离	application-test.properties
JPA (Java Persistence API)	Java 持久化标准，用于数据库操作	spring.jpa.hibernate.ddl-auto
Hibernate Dialect	指定数据库方言（如 MySQL 语法）	MySQL5InnoDBDialect

2. 安全与认证
术语	解释	出现位置示例
JWT (JSON Web Token)	用于身份验证的加密令牌	bezkoder.app.jwtSecret
JWT Expiration	Token 的有效期（毫秒）	bezkoder.app.jwtExpirationMs
AuthenticationEntryPoint	Spring Security 中处理未授权请求的入口	AuthEntryPointJwt
OncePerRequestFilter	确保每个请求只过滤一次的基类	AuthTokenFilter

3. 数据库与持久化
术语	解释	出现位置示例
DDL Auto (ddl-auto)	自动更新数据库表结构（如 update）	spring.jpa.hibernate.ddl-auto
DataSource	数据库连接配置（URL、用户名、密码）	spring.datasource.url
Hibernate Show SQL	控制是否打印 SQL 语句	spring.jpa.show-sql=true

4. 测试相关
术语	解释	出现位置示例
@SpringBootTest	标记为 Spring Boot 集成测试类	SpringBootBestPracticesApplicationTests
JUnit 5	Java 单元测试框架	@Test 注解
Test Profile	测试专用的配置（如内存数据库）	application-test.properties

5. 工具与依赖
术语	解释	出现位置示例
Lombok	通过注解减少样板代码（如 @Getter）	LoginRequest.java
Spring Boot Starter	预配置的依赖模块（如 spring-boot-starter-data-jpa）	pom.xml
Maven Dependency Scope	依赖作用域（如 runtime、test）	mysql-connector-java

6. 其他关键术语
术语	解释	出现位置示例
AOP (Aspect-Oriented Programming)	面向切面编程（如日志、事务）	spring-boot-starter-aop
DTO (Data Transfer Object)	数据传输对象（如 LoginRequest）	LoginRequest.java
