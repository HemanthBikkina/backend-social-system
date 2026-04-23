# Backend Social Media System

## Overview
This project is a basic backend system built using Spring Boot. It allows users to create posts and add comments.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

## Features
- Create Post API
- Add Comment API
- Database persistence using H2

## API Endpoints

### Create Post
POST /api/posts

Request Body:
{
"content": "My First Post",
"author": "Hemanth"
}

### Add Comment
POST /api/posts/{postId}/comments

Request Body:
{
"content": "Nice post",
"depthLevel": 1
}

## Database
H2 in-memory database is used for development. The system can be easily configured to use PostgreSQL.

## Note
The project is designed with a clean architecture and can be extended with features like Redis and scalability improvements.