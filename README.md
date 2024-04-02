<h1 align="center">
  DMI
</h1>

<h3 align="center">
    Java Spring Boot API featuring Object-Relational Mapping with JPA (Hibernate)
</h3>

<p align="center">
  <a href="https://github.com/alexbraga/dmi/commits/master"><img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/alexbraga/dmi"></a>
  <!-- <a href="https://github.com/alexbraga/dmi/blob/master/LICENSE"><img alt="GitHub license" src="https://img.shields.io/github/license/alexbraga/dmi?label=license"></a> -->
</p>

<h4 align="center">
	 Status: Finished
</h4>

<p align="center">
 <a href="#about">About</a> •
 <a href="#features">Features</a> •
 <a href="#diagrams">Diagrams</a> •
 <a href="#how-it-works">How it works</a> •
 <a href="#tech-stack">Tech Stack</a> •
 <a href="#how-to-contribute">How to contribute</a> •
 <a href="#author">Author</a> <!--•
 <a href="#license">License</a> -->

</p>

## About

<p align="justify">Spring Boot order management application focused on domain model implementation. The domain model includes "client", "order", "order item", "order status" and "product" entities to be instantiated. By design, an order can be associated with only one client; on the other hand, an order can be associated with many items, but each item can only belong to a single order ("one to many" relationship), and each item is associated with a single product. The class and object diagrams can be seen <a href="#diagrams">here</a>. The Object-Relational Mapping is achieved with the use of JPA (Hibernate), and the relational database chosen is the in-memory H2.</p>

---

## Features

- Class and object diagrams
- Relational database
- Database seeding through CommandLineRunner
- Domain model implementation with Object-Relational Mapping
- JPA with Hibernate
- Web service API
- Structure divided into Entities, Repositories and Controllers
- Classes and objects
- Encapsulation, getters and setters
- Enum types

---

## Diagrams

### Class Diagram

<img src="https://github.com/alexbraga/dmi/blob/master/diagrams/Class%20Diagram.drawio.png?raw=true" alt="Class Diagram" width="750" />

### Object Diagram

<img src="https://github.com/alexbraga/dmi/blob/master/diagrams/Object%20Diagram.drawio.png?raw=true" alt="Class Diagram" width="750" />

---

## How it works

1. <a href="#clone-this-repository">Clone this repository</a>
2. <a href="#run-the-application">Run the application</a>
3. <a href="#api-endpoints">API Endpoints</a>

### Pre-requisites

Before getting started, you'll need to have the following tools installed on your machine:

- [Git](https://git-scm.com)
- [Java OpenJDK 11](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/)

In addition, you might also want an IDE to work with the code, like
[IntelliJ IDEA](https://www.jetbrains.com/idea/).

### Clone this repository

```
git clone https://github.com/alexbraga/dmi.git
```

### Running the application

Navigate to the root directory of the project
```
cd dmi
```

Build the project
```
mvn compile
```

Run the application
```
mvn spring-boot:run
```

- Alternatively, open the project folder with your preferred IDE and run `/src/main/java/com/example/dmi/DMIApplication.java`

- The server will start at `localhost:8080`

### API Endpoints

- Get all orders in the database:
  - `GET` `/orders`

- Get order by id:
  - `GET` `/orders/{id}`

---

## Tech Stack

The following tools were used in the construction of the project:

#### **Language**

- **[Java OpenJDK 11](https://www.oracle.com/java/technologies/downloads/)**

#### **Framework**

- **[Spring](https://spring.io/)**

#### **Dependencies**

- Spring Web
- Spring Data JPA
- H2 Database

> See the file
> [pom.xml](https://github.com/alexbraga/dmi/blob/master/pom.xml)

#### **Utilities**

- Dependency Manager: **[Maven](https://maven.apache.org/)**
- IDE: **[IntelliJ IDEA](https://www.jetbrains.com/idea/)**
- API Testing: **[Postman](https://postman.com)**

---

## How to contribute

1. Fork the project
2. Create a new branch with your changes:
```
git checkout -b my-amazing-feature
```
3. Save your changes and create a commit message (in present tense) telling what you did:
```
git commit -m "Add my amazing feature"
```
4. Submit your changes:
```
git push origin my-amazing-feature
```
5. Create a pull request

---

## Author

<h4>Alexandre Braga</h4>

<div>
<a href="https://www.linkedin.com/in/alexgbraga/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-blue?style=for-the-badge&logo=Linkedin&logoColor=white" alt="LinkedIn"></a>&nbsp;
<a href="mailto:contato@alexbraga.com.br" target="_blank"><img src="https://img.shields.io/badge/-email-c14438?style=for-the-badge&logo=Gmail&logoColor=white" alt="E-Mail"></a>
</div>



<!-- ## License

This project is under the [MIT License](./LICENSE). -->
