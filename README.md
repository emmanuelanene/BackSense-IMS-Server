# 📦 Backsense – Inventory Management System

**Backsense** is a comprehensive backend system built for seamless **inventory tracking**, **supplier management**, and **transaction processing**.  
Designed for **speed**, **reliability**, and **clarity**, it leverages **Spring Boot**, **JWT Security**, and **Swagger UI** to deliver a secure and maintainable API for business inventory operations.

Whether managing products, recording purchases, or tracking sales, **Backsense** simplifies every workflow in one powerful backend solution.

---

## 🚀 Key Features

- **Product Management** – Add, update, delete, and search products with image support.
- **Category Management** – Organize products by category with full CRUD operations.
- **Supplier Management** – Track suppliers and update their details dynamically.
- **Transaction Tracking** – Record purchases, sales, and returns with automatic stock updates.
- **Role-Based Access** – Enforces secure user-level permissions via JWT.
- **Swagger UI** – Provides interactive REST documentation for easy API testing.

---

## ⚙️ Architecture Overview
### System Design

OasisCapital follows a **layered architecture** with distinct, well-defined responsibilities for maintainability and scalability.

#### High-Level Flow

```text
[ Client Application ]
         │
         ▼
[ Controller Layer ]  →  [ Service Layer ]  →  [ Repository Layer ]  →  [ MySQL Database ]
         │
         ├──► [ Security Layer (JWT) ]
         │
         └──► [ External Integrations: Stripe Payments, Email Notifications ]
```

---

## 🧠 Core Modules

- **User Management** – Registration, authentication, and role-based access.
- **Product Management** – CRUD operations with image upload support.
- **Category Management** – Organize and retrieve product categories.
- **Supplier Management** – Manage supplier details and relationships.
- **Transaction System** – Record sales, purchases, and product returns.
- **Security** – JWT-based authentication implemented with Spring Security.
- **Documentation** – Swagger UI for interactive API exploration.

---

## 🧩 Technology Stack

### Backend Framework
- **Spring Boot (Java)** – Core backend framework.
- **Spring Web** – RESTful API design.
- **Spring Data JPA** – ORM and database abstraction.
- **ModelMapper** – DTO ↔ Entity mapping.
- **Lombok** – Reduces boilerplate with annotations.

### Authentication & Security
- **Spring Security** – Core authentication and authorization.
- **JWT (JJWT)** – Stateless token-based authentication.
- **BCrypt** – Password hashing for user security.

### Database
- **MySQL** – Primary data storage engine.

### API Documentation
- **SpringDoc OpenAPI / Swagger UI** – Interactive REST documentation.  
  **URL:** 
```bash
 http://localhost:8080/swagger-ui/index.html
```

---

## 📦 Core Functionalities

This system provides comprehensive **user and authentication** functionalities, enabling user registration with specific roles, secure login via JWT tokens, and management of user profiles, including fetching, updating, and deleting user data.

For **category management**, the system allows for the creation, retrieval, modification, and deletion of product categories. Users can fetch a complete list of all categories or look up a specific one by its ID.

The **product management** module handles all product-related operations. This includes creating and updating products with optional images, retrieving lists of all products or individual items, deleting products, and searching for them by name or description. It also includes a dedicated function for saving product images.

Finally, the **supplier management** section is responsible for handling supplier data. It allows for adding new suppliers, updating their details, retrieving a list of all suppliers or a single one by ID, and deleting supplier records from the system.


## 🧩 Project Structure
```bash
src/main/java/com/emmanuelanene/Backsense
│── config/ # Security & application configuration
│── controllers/ # REST API endpoints
│── dtos/ # Request and response data transfer objects
│── entities/ # Database models (JPA entities)
│── enums/ # Role, transaction type, and status definitions
│── exceptions/ # Custom exception handling
│── repositories/ # Data persistence layer
│── security/ # JWT authentication and authorization
│── services/ # Business logic layer
│── utils/ # Helper classes (validation, response handling)
│── BacksenseApp.java # Application entry point
```


---

## ⚙️ Installation & Setup

### Prerequisites
- **Java 17+**
- **Maven**
- **MySQL**

---

### Clone Repository
```bash
git clone https://github.com/emmanuelanene/OasisCapital-Server.git
cd OasisCapital-Server
```

### Install Dependencies
```bash
mvn clean install
```

### Configure Environment
**Rename:**
```bash
application-dev.properties → application.properties
```
**Update the following in application.properties:**
- MySQL credentials
- Mail sender (SMTP)
- Frontend URLs

### Run Application
```bash
mvn spring-boot:run
```

### API Documentation

Interactive documentation is available via **Swagger UI** at:
```bash
http://localhost:8080/swagger-ui/index.html
```


---

## 🧑‍💻 Contribution

**Want to contribute?**

1. Fork the repository
2. Create a new feature branch
3. Commit your changes
4. Submit a Pull Request

> Please follow **Java naming conventions** and **Spring Boot project structure** best practices.


---

## 📄 License

This project is licensed under the **MIT License** — you’re free to use, modify, and distribute.

---


## 🏁 Closing Note

**BackSense Server** — powering a smarter, faster, and more secure Inventory Management experience.

Built with ❤️ and **Spring Boot** by *Emmanuel Anene*.
