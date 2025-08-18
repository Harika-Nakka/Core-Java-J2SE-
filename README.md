# Banking Management System (Java)

## 📌 Overview
A Java-based console application that simulates a simple banking system using the **MVC design pattern**.  
The system supports customer creation, account management, deposits, withdrawals, and balance checks.

## 🛠 Features
- **MVC Architecture** for clean separation of concerns.
- **OOP Principles**:
  - Abstraction via an abstract `Account` class.
  - Polymorphism in `SavingsAccount` and `CurrentAccount` implementations.
  - Encapsulation of fields with getters and setters.
- Two account types:
  - **Savings Account** – enforces a minimum balance.
  - **Current Account** – supports overdraft limits.
- Menu-driven console interface for user interaction.
- In-memory storage using Java **HashMap** for fast lookups.

## 💻 Tech Stack
- **Language**: Java
- **Architecture**: MVC
- **Collections**: HashMap




# Ticket Booking System (Core Java)

## 📖 Overview
A simple **Ticket Booking System** implemented in Core Java using OOP principles.  
The project demonstrates **user management, ticket booking, journey tracking, and cancellation** with clean modular design.

## ✨ Features
- Create and manage user accounts
- Book tickets with unique IDs and fare calculation
- Search tickets by user ID or ticket ID
- Modify boarding/destination points
- Cancel tickets and delete accounts (with cascade ticket deletion)
- Console-based interactive menu

## 🛠 Technologies Used
- Core Java (J2SE)
- OOP Concepts (Encapsulation, Immutability, Serialization)
- Collections Framework (`ArrayList`, `Iterator`)

## 📂 Project Structure
- `Ticket.java` → Represents a ticket
- `User.java` → Represents a user
- `TicketBookingSystem.java` → Service layer for users & tickets
- `MainClass.java` → Interactive console app

## ▶️ How to Run
1. Clone the repository
   ```bash
   git clone <your_repo_link>
