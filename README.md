# Movie Database REST API

A simple Spring Boot RESTful API for managing movies, actors, and directors in a MongoDB database.

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
    - [Installation](#installation)
    - [Configuration](#configuration)
- [Usage](#usage)
    - [Endpoints](#endpoints)
    - [Examples](#examples)
- [Testing](#testing)
    - [Unit Tests](#unit-tests)
- [Code Quality](#code-quality)
- [Conversation Logs](#conversation-logs)
- [Project Feedback](#project-feedback)


## Overview

This project provides a RESTful API for managing a movie database. It includes endpoints for CRUD operations on movies, actors, and directors, with data stored in a MongoDB database.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- MongoDB installed and running

## Getting Started

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/movie-database-api.git
    cd movie-database-api
    ```

2. Build and run the application:

    ```bash
    ./mvnw spring-boot:run
    ```

### Configuration

Modify the `application.properties` file to set MongoDB connection details:

```properties
# MongoDB connection settings
spring.data.mongodb.uri=mongodb://localhost:27017/moviedb
```
# Usage

## Endpoints
The API provides the following main endpoints:

* /api/movies: CRUD operations on movies
* /api/actors: CRUD operations on actors
* /api/directors: CRUD operations on directors
## Examples

### Get all movies

```bash
curl http://localhost:8080/api/movies
```
## Add a New Movie

```bash
curl -X POST -H "Content-Type: application/json" -d '{"title":"Inception","releaseDate":"2010-07-16","runtime":148,"actors":["Leonardo DiCaprio","Joseph Gordon-Levitt"],"directors":["Christopher Nolan"]}' http://localhost:8080/api/movies
```
# Testing
## Unit Tests
Run the unit tests with the following command:

```bash
./mvnw clean test
```
You can view the coverage report at target/site/jacoco/index.html.
Test Coverage

Check the test coverage using the following command:

```bash
./mvnw test jacoco:report 
``` 

View the coverage report in the target/site/jacoco directory (Maven) .

## Code Quality

Run SonarQube analysis to check code quality:

```bash
./mvnw sonar:sonar
``` 
## Conversation Logs

ChatGPT conversation logs are available in the file [chat.log](src/main/resources/chat.log).
Conversation link: https://chat.openai.com/share/08e69fd5-0e97-4b85-a396-a2b8bc9f7269

# Project Feedback

- **Was it easy to complete the task using AI?**
    - Absolutely, leveraging AI made the task significantly more straightforward.

- **How long did the task take you to complete?**
    - The task was completed in approximately 1 hour.

- **Was the code ready to run after generation? What did you have to change to make it usable?**
    - The generated code was ready to run; I made minor adjustments to the readme for clarity.

- **Which challenges did you face during completion of the task?**
    - The primary challenge revolved around formulating questions in a manner that AI could understand, leading to satisfactory responses.
