# Spring Boot Pro Starter Application

## Overview

This Spring Boot Pro Starter Application serves as a template to kick-start your Spring Boot projects. It includes a basic setup with an H2 database, sample CRUD Components and Basic Security configuration. The project is designed to be easily customized and extended according to your needs.

## Steps to Get Started

1. **Clone the Repository**

- Clone project
- Rename the project directory to your desired project name.
- cd springboot-pro-starter-application

2. **Update Project Name**
- Modify the `name` field in the `pom.xml` file.

3. **Install Dependencies**

- mvn clean install

4. **Run the Application**

- mvn spring-boot

5. **Access the Endpoint**
- Open your browser or use a tool like `curl` or Postman to access the endpoint:
  ```
  http://localhost:8080/api
  ```
- You should see the response: `{"id":1,"message":"Hello World!"}`

## Folder Structure

- `src/main/java/com.project.springboot_pro_starter_application`: Contains the main application code.
- `config/`: Contains security configuration.
- `controller/`: Contains REST controllers.
- `repository/`: Contains repository for data access.
- `src/main/resources/`: Contains application properties and schema file.
- `src/test/java/`: Contains unit and integration tests.

## Customization

- **Database Configuration:**
- Modify `src/main/resources/application.properties` to configure database settings.


- **Security Configuration:**
- Update `src/main/java/com.project.springboot_pro_starter_application/config/SecurityConfig.java` to adjust security settings.


- **CRUD Components**
- Update CRUD Components to customize and extended project according to your needs.
