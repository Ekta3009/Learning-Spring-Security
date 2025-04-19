# 🛡️ Spring Security + JWT Authentication Backend

A minimal Spring Boot project demonstrating how to implement user authentication and authorization using **Spring Security**, **JWT tokens**, and a **custom filter chain**.

## 📌 Features

- User registration with password encryption
- Login with username and password
- JWT-based authentication
- Protected route to view a list of products (mocked)
- Spring Security filter chain customization
- No frontend – tested via Postman

## 🧰 Tech Stack

- Java 17+
- Spring Boot
- Spring Security
- JWT (io.jsonwebtoken - JJWT)
- MySQL
- Maven

### 📪API Endpoints

<img width="545" alt="image" src="https://github.com/user-attachments/assets/5373e1b5-c1d3-42b2-9981-1b3b50ed6197" />

### 🔐Authentication Flow
Register a user via /register

Login via /login and receive a JWT token

Use the JWT token in the Authorization header to access protected routes:
Authorization: Bearer <your_token>

### 🧪 Testing
Use Postman to:

Register a user at /register

Login at /login to get a token

Access /products with the JWT

### 🧠 What I Learned
Deep understanding of Spring Security filter chain

How to implement JWT authentication from scratch

Handling authentication/authorization without using session

Password encryption with BCrypt

