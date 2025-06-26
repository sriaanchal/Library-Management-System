# Library-Management-System

# 📚 Library Management System (Java OOP Project)

A simple, console-based *Library Management System* implemented in Java using core Object-Oriented Programming concepts. This project allows users to *view books, **issue books, and **return books* with real-time tracking of issued status — perfect for beginners learning Java OOP.

---

## 🔍 Overview

This project simulates the basic functionality of a real-world library system:

- Users can *view all available books*.
- Books can be *issued to users* (each book can only be issued once).
- Issued books can be *returned* by the respective user.
- All data is handled in memory using ArrayList and HashMap.

---

## 🧱 Technologies Used

- *Language*: Java (JDK 8 or above)
- *IDE*: VS Code / IntelliJ / Eclipse (or any Java-supported editor)
- *Execution*: Command-line interface (CLI)

---

## 🧩 Object-Oriented Design

The application uses multiple classes:

### 📘 Book
Represents a book with the following:
- id: Unique book identifier
- title: Book title
- isIssued: Boolean flag for issue status
- Methods: issue(), returned(), and overridden toString()

### 👤 User
Represents a library user:
- id: User ID
- name: User name

### 🏛 Library
Central class to manage books and issued status:
- Stores all Book objects in an ArrayList
- Tracks issued books using HashMap<BookID, UserID>
- Methods: addBook(), showBooks(), issueBook(), returnBook()

### 🚀 Main
Handles user interaction:
- Console menu for operations
- Pre-loaded books and users
- Runs the main program loop

---

## 📂 Sample Run

```text
--- Library Menu ---
1. View Books
2. Issue Book
3. Return Book
4. Exit
Enter choice: 1
1. Java Programming (Issued: No)
2. Python Basics (Issued: No)
3. Data Structures (Issued: No)
▶ How to Run
Clone or Download the project files.

Open a terminal and compile the code:

javac Main.java
Run the program:

java Main
📌 Features Summary
✅ View all books with issued status

✅ Issue a book to a specific user

✅ Return a book

✅ Data managed using Java collections (ArrayList, HashMap)

✅ Clear and beginner-friendly OOP structure
