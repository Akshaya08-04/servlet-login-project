# Servlet Login Project

## Project Overview

This project demonstrates a basic **Java Servlet-based web application** built using **Apache Tomcat** and **Maven**.
The application implements a simple **login system** and progressively adds validation features through different **User Cases (UCs)**.

Each user case is implemented using **GitFlow feature branches**, allowing incremental development and clear version control.

---

## Technologies Used

* Java (JDK 17+)
* Java Servlets
* Apache Tomcat 9
* Maven
* Git & GitFlow
* GitHub
* HTML
* JSP

---
## User Cases Implemented
UC1 – First Servlet

Create a basic servlet that returns a simple HTML response.

UC2 – Login with Predefined User

Implement a login form that authenticates a predefined username and password.

UC3 – Valid Name Rule

Extend the login system to validate that the username:

Starts with a capital letter

Has at least 3 characters

UC4 – Password Validation

Enhance password validation with rules:

-Minimum 8 characters

-At least 1 uppercase letter

-At least 1 numeric digit

-Exactly 1 special character