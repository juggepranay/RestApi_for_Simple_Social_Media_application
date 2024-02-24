
# Simple Social Media REST API

This repository contains the source code for a basic RESTful API developed in Java using Spring Boot and an H2 in-memory database. The API is designed to manage users and their posts for a simple social media application.

## Project Overview

Objective: Implement CRUD operations for user management and establish a one-to-many relationship between users and posts.
Features

## User Management:

Create, read, update, and delete user details.
Validate user details, including a minimum name length of 2 characters and a birth date in the past.
Implement comprehensive error handling for various scenarios.

## Post Management:
Design a Post class.

Establish a one-to-many relationship between users and posts, allowing users to have multiple posts while each post is associated with a single user.
Database Integration:

Utilize an H2 in-memory database for data storage.
Facilitate easy testing and deployment with the in-memory database.

## Best Practices:

Follow best practices in RESTful API development.
Implement appropriate HTTP response status codes for a robust and secure API.

## Technologies Used

Java

Spring Boot

H2 Database

RESTful API Design

# Usage

# Clone the repository:
git clone https://github.com/your-username/social-media-api.git

# Build and run the project using your preferred IDE or by executing:
./mvnw spring-boot:run

# Access the API at http://localhost:8080.

# Examples

## Get All Users:
<img width="1440" alt="Screenshot 2024-02-23 at 7 33 51 PM" src="https://github.com/juggepranay/RestApi_for_Simple_Social_Media_application/assets/64743611/c7277384-d880-4ab0-a378-7751d430bd58">

## Get User by Id:
<img width="1440" alt="Screenshot 2024-02-23 at 7 34 27 PM" src="https://github.com/juggepranay/RestApi_for_Simple_Social_Media_application/assets/64743611/f1d64203-f51c-4ac0-8b89-0894b3d37114">

## create User by using Post Request Method:
<img width="1433" alt="Screenshot 2024-02-24 at 11 51 17 AM" src="https://github.com/juggepranay/RestApi_for_Simple_Social_Media_application/assets/64743611/865e07b7-f83a-4b41-bdf8-72aeabd99a0a">

## Get all Posts of a User
<img width="1440" alt="Screenshot 2024-02-24 at 12 03 23 PM" src="https://github.com/juggepranay/RestApi_for_Simple_Social_Media_application/assets/64743611/6c969416-fd84-4043-ab16-55a1cc5219c5">

## Create a Post for a Particular User
<img width="1433" alt="Screenshot 2024-02-24 at 12 08 10 PM" src="https://github.com/juggepranay/RestApi_for_Simple_Social_Media_application/assets/64743611/85f77532-f26f-499e-b4c8-61a5feeeadf9">

## Delete a Post of a User by PostId Using Delete Request Method:
<img width="1435" alt="Screenshot 2024-02-24 at 12 14 05 PM" src="https://github.com/juggepranay/RestApi_for_Simple_Social_Media_application/assets/64743611/ae001747-384b-40b3-8e16-91d76bd6fc41">









