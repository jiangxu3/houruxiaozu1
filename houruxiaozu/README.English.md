项目介绍
/**
 * Coaching Institute Management System
 * 
 * A Spring Boot application demonstrating enterprise-grade development practices
 * with comprehensive features for managing coaching institute operations.
 * 
 * Key Highlights:
 * - Implements Java 8+ features (Lambdas, Streams, Optionals)
 * - Follows SOLID principles and clean code practices
 * - Modular architecture with clear separation of concerns
 */
**/
核心功能
/**
 * Implemented Technical Modules:
 * 
 * 1. Exception Handling - Custom exception hierarchy with global @ControllerAdvice
 * 2. Transaction Management - ACID-compliant operations with @Transactional
 * 3. AOP - Cross-cutting concerns via aspects (logging, auditing)
 * 4. Dependency Injection - Resolved autowiring conflicts using @Qualifier
 * 5. Security - JWT authentication with Spring Security
 * 6. Testing - JUnit 5 tests with Mockito (unit) and @SpringBootTest (integration)
 * 7. Validation - Bean Validation 2.0 (JSR-380) annotations
 * 8. Logging - SLF4J with Logback implementation
 */
**/
安装说明
/**
 * Prerequisites Installation:
 * 
 * 1. Java Development Kit:
 *    - Requires JDK 17+ (https://adoptium.net/)
 *    - Verify with: java -version
 * 
 * 2. IDE Setup:
 *    - IntelliJ IDEA recommended (https://www.jetbrains.com/idea/)
 *    - Install Lombok plugin for IDE
 * 
 * 3. Database:
 *    - MySQL 8.0+ (https://dev.mysql.com/downloads/)
 *    - Create schema: CREATE DATABASE coaching_institute;
 * 
 * 4. Build Tool:
 *    - Maven 3.6.3+ (https://maven.apache.org/)
 *    - Verify with: mvn -v
 * 
 * 5. Version Control:
 *    - Git (https://git-scm.com/)
 * 
 * 6. API Client:
 *    - Postman (https://www.postman.com/) for endpoint testing
 */
**/
设置说明
/**
 * Application Configuration:
 * 
 * 1. Clone repository:
 *    git clone https://github.com/haffani/spring-transaction-management.git
 *    cd spring-transaction-management
 * 
 * 2. Configure database:
 *    Edit src/main/resources/application.properties:
 *    - spring.datasource.url=jdbc:mysql://localhost:3306/coaching_institute
 *    - spring.datasource.username=your_username
 *    - spring.datasource.password=your_password
 * 
 * 3. Build project:
 *    mvn clean install
 * 
 * 4. Run application:
 *    mvn spring-boot:run
 * 
 * 5. Access endpoints:
 *    - API Docs: http://localhost:8080/swagger-ui.html
 *    - H2 Console (if enabled): http://localhost:8080/h2-console
 */
**/
事务管理
/**
 * Money Transfer Scenario Demonstration:
 * 
 * 1. Initial State:
 *    - Shows account balances before transaction
 *    ![Initial State](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/h2.png)
 * 
 * 2. Successful Transfer:
 *    - POST request to /api/transfer
 *    - Commit demonstrated in database update
 *    ![POST Request](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/postreq.png)
 *    ![After Commit](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/after.png)
 * 
 * 3. Failed Transfer:
 *    - Attempt to transfer to invalid account
 *    - Rollback demonstrated with exception
 *    ![Rollback Trigger](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/rollbackforcing.png)
 *    ![Exception Log](https://github.com/haffani/v4/blob/master/content/posts/spring-trx-management/no%20such%20elemnt.png)
 * 
 * Key Observations:
 * - @Transactional annotation behavior
 * - Automatic rollback on RuntimeException
 * - Consistent state maintenance
 */
**
