# Spring Boot 教学机构管理系统使用指南

[贡献者: 杨少唯2205308050334/Ecy - 使用指南]

## 快速入门指南

### 1. 系统访问
```bash
# 启动应用
mvn spring-boot:run

# 访问系统
在浏览器中打开 http://localhost:8080
```

### 2. 身份认证
#### 注册新用户
```http
POST /api/auth/signup
Content-Type: application/json

{
    "username": "newuser",
    "email": "user@example.com",
    "password": "yourpassword",
    "role": ["user"]
}
```

#### 登录
```http
POST /api/auth/signin
Content-Type: application/json

{
    "username": "newuser",
    "password": "yourpassword"
}
```

### 3. 课程管理
#### 获取所有课程
```http
GET /api/courses
Authorization: Bearer {your_jwt_token}
```

#### 创建新课程
```http
POST /api/courses
Authorization: Bearer {your_jwt_token}
Content-Type: application/json

{
    "name": "Spring Boot 进阶",
    "description": "Spring Boot 高级主题",
    "duration": "3个月",
    "price": 299.99
}
```

#### 更新课程
```http
PUT /api/courses/{courseId}
Authorization: Bearer {your_jwt_token}
Content-Type: application/json

{
    "name": "更新后的课程名称",
    "description": "更新后的描述"
}
```

#### 删除课程
```http
DELETE /api/courses/{courseId}
Authorization: Bearer {your_jwt_token}
```
