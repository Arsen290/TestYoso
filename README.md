# User Management Web Service

## Overview

This project implements a simple web service for user management using Java and Spring Boot. It provides basic functionalities for storing and retrieving user data through a RESTful API.

## Functional Requirements

- **Store new user:**
- **Retrieve all stored users:**

## Project Structure

- `src/main/java/com/example/usermanagement/controller`: Contains the controller classes.
- `src/main/java/com/example/usermanagement/dto`: Contains the Data Transfer Object classes.
- `src/main/java/com/example/usermanagement/entity`: Contains the Entity class.
- `src/main/java/com/example/usermanagement/repository`: Contains the Repository interface.
- `src/main/java/com/example/usermanagement/service`: Contains the Service class.

## Instructions on How to Run

1. **Prerequisites:**
   - Ensure you have Java and Maven installed on your machine.

2. **Clone the Repository:**
   ```bash
   git clone <repository-url>

3. **Run the Application:**
   ```bash
   mvn spring-boot:run
   ```
   The application will be accessible at http://localhost:8080.


## API Endpoints
POST /api/users: Create a new user.
GET /api/users: Retrieve all stored users.

## Sample Request and Response
POST http://localhost:8080/api/users
Content-Type: application/json

{
  "username": "zgf",
  "password": "zggzfzg",
  "givenName": "zfgz",
  "lastName": "12"
}

## Sample Request to Retrieve All Users
Request:
GET http://localhost:8080/api/users

