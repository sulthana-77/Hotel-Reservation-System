# Hotel Reservation System

## Project Overview

The Hotel Reservation System is a Java-based console application that allows users to manage hotel room bookings efficiently. The project supports room booking, booking cancellation, room availability management, and customer details management. It has been enhanced with JDBC and MySQL to store booking information in a relational database.

## Features

* View available rooms
* Book a room
* Cancel a booking
* Display customer booking details
* Generate Booking ID automatically
* Phone number validation
* Store booking information in MySQL database using JDBC
* Simple console-based interface

##  Technologies Used

* Java
* Object-Oriented Programming (OOP)
* JDBC
* MySQL
* Git & GitHub

## Project Structure
Hotel-Reservation-System
│
├── lib
│   └── mysql-connector-j-9.x.x.jar
│
├── src
│   ├── Main.java
│   ├── Hotel.java
│   ├── Room.java
│   ├── BookingDAO.java
│   ├── DBConnection.java
│   ├── TestBooking.java
│   └── TestConnection.java

##  Database

Database Name:
hotel_db
Table:
bookings
## How to Run
1. Clone the repository.
2. Create the `hotel_db` database in MySQL.
3. Add the MySQL Connector/J JAR to the project.
4. Update your MySQL username and password in `DBConnection.java`.
5. Run the project using the Java extension in VS Code.
##  Output
* Database connection successful
* Room booking successful
* Booking stored in MySQL database

##  Author

**Shaik Sanobar Sulthana**
