# Spring Boot security with JPA

Simple overview how to use Spring security Form login with JPA

## Description

Spring Boot, REST, Spring security, JPA

## Getting Started

### Dependencies

* Java 11
* Gradle
* PostgreSQL

### Installing

* Create "sbsec" database
* Set Java 11
```
sudo update-alternatives --config java (select Java 11)
```
* Build application
```
gradle clean bootjar
```

### Executing program

* Run the program
```
java -jar spring-security-jpa-demo-1.0.0.jar
```
* Execute "insert.sql" script

* Get public URL:
```
GET http://localhost:8080/
```
* Get user area:
```
GET http://localhost:8080/user/
username: simpleuser
password: password
```
* Get admin area:
```
GET http://localhost:8080/admin/
username: simpleadmin
password: password
```

## Author

Kenyeres Géza\
https://hu.linkedin.com/in/g%C3%A9za-kenyeres-17341631
