# Login and Register Pages using JSP and Servlets

A simple **Java web application** that implements user **login** and **registration** using **JSP**, **Servlets**, and **MySQL** database connectivity.

---

## 🚀 Features

- User registration with form validation  
- Secure login with database verification  
- Database connection using JDBC  
- Separation of concerns with DAO (Data Access Object) pattern  
- JSP pages for user interface (login, register, dashboard)

---

## 🧰 Technologies Used

- **Java 17+**
- **JSP (JavaServer Pages)**
- **Servlets**
- **JDBC (MySQL Connector/J)**
- **MySQL**
- **Tomcat** (or any Jakarta EE compatible server)
- **Eclipse IDE** (optional)

## 🗄️ Database Setup

1. Create a MySQL database:
   ```sql
   CREATE DATABASE usersdb;
   USE usersdb;
   Create users table:
   CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);

2. Update your database credentials in the connection file:
String user = "root";
String pass = "your_password";
String database ="your_database";
String url = "jdbc:mysql://localhost:3306";

## How to run

1. Clone the repository:
git clone https://github.com/yourusername/ConnDB.git

2. Open the project in your preferred IDE

3. Deploy the project on Apache Tomcat

4. Acess in your browser:
http://localhost:8080/ConnDB/login.jsp



