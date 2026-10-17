Pokémon Review API 🐉

A RESTful API built with Java and Spring Boot as a hands-on project to learn backend development fundamentals. The project focuses on understanding how Spring Boot applications are structured and how REST APIs interact with a database through a layered architecture.

Rather than simply following tutorials, I'm building this project step by step to practice the core concepts of Spring Boot.

🎯 Project Goals

Learn Spring Boot fundamentals through practical implementation.

Understand REST API development and HTTP methods.

Practice layered architecture and separation of concerns.

Learn how Spring Data JPA simplifies database operations.

Improve backend development skills by building and testing CRUD operations.

🛠️ Tech Stack

Java — Object-oriented programming.

Spring Boot — Backend application framework.

Spring Web — Building REST endpoints.

Spring Data JPA — Database persistence and repository operations.

Hibernate — Object-relational mapping (ORM).

Jakarta Persistence (JPA) — Entity mapping and persistence annotations.

Lombok — Reducing boilerplate code.

Maven — Dependency management and project build.

Postman — Testing HTTP endpoints.

🏗️ Architecture

The application follows a layered architecture:

Controller
    ↓
Service
    ↓
Repository
    ↓
Database

Controller Layer: Receives HTTP requests and returns responses.

Service Layer: Contains application logic and coordinates operations.

Repository Layer: Uses Spring Data JPA to access and manage database records.

Entity Layer: Represents application data stored in the database.

This structure helps separate responsibilities and makes the application easier to maintain and extend.

📚 What I'm Learning

1. Spring Boot Fundamentals

Creating a Spring Boot application.

Understanding dependency injection through constructor injection.

Using @RestController, @Service, and Spring's component management.

Configuring request mappings with @RequestMapping.

2. REST API Development

Understanding HTTP methods: GET, POST, PUT, and DELETE.

Mapping URLs to controller methods.

Using @PathVariable to extract values from URLs.

Using @RequestBody to convert JSON into Java objects.

Returning Java objects as JSON responses.

3. Spring Data JPA and Database Operations

Creating entity classes with @Entity.

Defining primary keys with @Id.

Generating IDs with @GeneratedValue.

Creating repositories using JpaRepository.

Performing CRUD operations without writing SQL queries for basic operations.

4. Object-Oriented Design and Code Organization

Separating controllers, services, repositories, and entities.

Managing dependencies between application layers.

Understanding how a request travels through a Spring Boot application.

🚀 Implemented Features

The current implementation focuses on managing Pokémon.

HTTP Method

Endpoint

Description

GET

/api/pokemon

Retrieve all Pokémon

GET

/api/pokemon/{id}

Retrieve a Pokémon by ID

POST

/api/pokemon

Create a Pokémon

PUT

/api/pokemon/{id}

Update a Pokémon

DELETE

/api/pokemon/{id}

Delete a Pokémon

Example Pokémon JSON

{
  "name": "Pikachu",
  "type": "Electric"
}
