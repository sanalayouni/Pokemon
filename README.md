# Pokémon Review API

A REST API built with Java and Spring Boot as a hands-on project to learn backend development. I'm building it step by step to understand how a Spring application works, from handling HTTP requests to persisting data in a database.

## About the Project

The goal is to learn Spring Boot by implementing features rather than just following tutorials. I'm currently focusing on Pokémon CRUD operations and understanding the role of each layer in the application.

## Tech Stack

- **Java** — Object-oriented programming
- **Spring Boot & Spring Web** — Application setup and REST endpoints
- **Spring Data JPA & Hibernate** — Database access and ORM
- **Lombok** — Reducing boilerplate code
- **Maven** — Dependency and build management
- **Postman** — API testing

## How It Works

The application uses a layered architecture to keep responsibilities separate.

```text
HTTP Request
     |
     v
Controller
     |
     v
Service
     |
     v
Repository
     |
     v
Database
```

- **Controller:** Handles incoming HTTP requests.
- **Service:** Contains the application's logic.
- **Repository:** Provides database operations through Spring Data JPA.
- **Entity:** Defines the structure of the data stored in the database.

## Current Features

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/pokemon` | Retrieve all Pokémon |
| `GET` | `/api/pokemon/{id}` | Retrieve a Pokémon by ID |
| `POST` | `/api/pokemon` | Create a Pokémon |
| `PUT` | `/api/pokemon/{id}` | Update a Pokémon |
| `DELETE` | `/api/pokemon/{id}` | Delete a Pokémon |

### Example Request

Create a Pokémon using `POST /api/pokemon`:

```json
{
  "name": "Pikachu",
  "type": "Electric"
}
```

## What I'm Learning

- Building REST APIs with Spring Boot
- Constructor-based dependency injection
- Mapping HTTP requests with Spring MVC annotations
- Working with entities and repositories using Spring Data JPA
- Understanding CRUD operations and layered architecture

## What's Next

- Implement the review feature and connect reviews to Pokémon
- Learn how to model entity relationships with JPA
- Add input validation and proper error handling
- Improve API responses and HTTP status codes
- Write tests for the endpoints

---

**Status:** In progress — building and learning one feature at a time.
