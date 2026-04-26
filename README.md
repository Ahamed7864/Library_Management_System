# Library_Management_System

A console-based Library Management System built using Java that demonstrates Object-Oriented Programming (OOP), SOLID principles, and design patterns.

---

Features

Book Management

- Add new books to the library
- Remove books from inventory
- Search books by title
- Track availability status

Patron Management

- Register patrons
- Maintain borrowing history

Lending System

- Checkout books
- Return books
- Track issued books

Design Patterns Used

- Strategy Pattern → Flexible search functionality
- Factory Pattern → Book object creation
- Observer Pattern → Notification system (extensible)

---

Project Structure

com.library
├── model        # Entities (Book, Patron, Transaction)
├── repository   # Data storage layer
├── service      # Business logic
├── strategy     # Search strategies
├── factory      # Object creation
├── observer     # Notification system
├── exception    # Custom exceptions
├── util         # Utility classes
└── Main.java    # Entry point (CLI)

---

Tech Stack

- Java (JDK 8+)
- Maven (for dependency management)
- Java Collections Framework
- Console-based UI

---

How to Run

1. Clone or download the project
2. Open in IntelliJ / Eclipse / VS Code
3. Ensure JDK is configured
4. Run:

Main.java

---

Sample Menu

===== Library Menu =====
1. Add Book
2. Search Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Exit

---

Example Usage

- Add books with ISBN, title, author, year
- Search books by title keyword
- Checkout and return books
- View results in console

---

OOP & SOLID Principles

- Encapsulation → Data hidden inside classes
- Abstraction → Clear interfaces (e.g., SearchStrategy)
- Inheritance & Polymorphism → Strategy implementations
- SRP → Each class has one responsibility
- OCP → Extend functionality without modifying code
- DIP → Services depend on abstractions

---

Future Enhancements

- Search by author and ISBN
- Fine calculation system
- Database integration (MySQL)
- REST API using Spring Boot
- Role-based access (Admin/Librarian)
