# Library Resource Borrowing System

A Java implementation of a **SOLID Design Principles** compliant library resource borrowing system. This project demonstrates how to apply the **Dependency Inversion Principle (DIP)** to create a flexible and extensible library management system that can seamlessly accommodate new resource types without violating other SOLID principles.

## 📋 Overview

The Library Resource Borrowing System allows students to borrow various types of library resources including books, journals, audiobooks, and e-journals. The system is designed with SOLID principles in mind, particularly the **Dependency Inversion Principle**, which ensures that high-level modules (Student) depend on abstractions (Borrowable interface) rather than concrete implementations.

## 🏗️ Architecture

This project implements **SOLID Design Principles** with the following components:

- **Borrowable Interface**: Defines the contract for all borrowable resources
- **Student Class**: High-level module that depends on the Borrowable abstraction
- **Concrete Resource Classes**: Book, Journal, AudioBook, and EJournal implementations
- **Test Program**: Demonstrates the SOLID principles in action

### SOLID Principles Implementation

- **Single Responsibility Principle (SRP)**: Each class has a single, well-defined responsibility
- **Open/Closed Principle (OCP)**: The system is open for extension (new resource types) but closed for modification
- **Liskov Substitution Principle (LSP)**: All resource types can be substituted for the Borrowable interface
- **Interface Segregation Principle (ISP)**: The Borrowable interface is focused and cohesive
- **Dependency Inversion Principle (DIP)**: Student depends on the Borrowable abstraction, not concrete implementations

### Design Benefits

- **Flexibility**: Easy to add new resource types without modifying existing code
- **Maintainability**: Clean separation of concerns and loose coupling
- **Testability**: Easy to mock and test individual components
- **Extensibility**: New resource types can be added without breaking existing functionality
- **Type Safety**: Strong typing ensures compile-time safety

## 📊 UML Class Diagram
<img width="1440" height="891" alt="UML Class Diagram" src="https://github.com/user-attachments/assets/8df21601-7142-4d7b-a225-143d6608c26a" />

The following diagram illustrates:
- The architecture of the Library Resource Borrowing System
- Relationships between the core components:
  - The `Borrowable` interface as the abstraction
  - Concrete implementations: `Book`, `Journal`, `AudioBook`, `EJournal`
  - The `Student` class depending on the `Borrowable` abstraction
- How the Dependency Inversion Principle is applied in this project

## 🚀 Features

- **Multiple Resource Types**: Support for Books, Journals, AudioBooks, and E-Journals
- **SOLID Compliant**: Implements all five SOLID design principles
- **Type-Safe Operations**: Strong typing for all resource types
- **Extensible Design**: Easy to add new resource types
- **Clean Architecture**: Well-structured, maintainable code
- **Dependency Inversion**: High-level modules depend on abstractions

## 📁 Project Structure

```
library-resource-borrowing-system/
├── src/
│   ├── Borrowable.java               # Interface defining borrowable resources
│   ├── Student.java                  # Student class implementing borrowing logic
│   ├── Book.java                     # Book resource implementation
│   ├── Journal.java                  # Journal resource implementation
│   ├── AudioBook.java                # AudioBook resource implementation
│   ├── EJournal.java                 # EJournal resource implementation
│   └── TestProgram.java              # Main application demo
└── README.md                         # Project documentation
```

## 🛠️ Installation & Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Getting Started

1. **Clone or download** the project files
2. **Navigate** to the project directory
3. **Compile** the Java files:
   ```bash
   javac src/*.java
   ```
4. **Run** the application:
   ```bash
   java -cp src TestProgram
   ```

## 📖 Usage

### Basic Usage

The main application (`TestProgram.java`) demonstrates how to use the SOLID-compliant borrowing system:

```java
// Create students
Student student1 = new Student("Dominic Santos", "22-16901-257");
Student student2 = new Student("Lara Mendoza", "22-15678-429");

// Create different types of borrowable resources
Borrowable book = new Book("Introduction to Java");
Borrowable journal = new Journal("AI Research Journal");
Borrowable audioBook = new AudioBook("Learn Java by Listening");
Borrowable eJournal = new EJournal("Digital Journal of AI Innovations");

// Students can borrow any type of resource through the same interface
student1.borrowResource(book);
student2.borrowResource(journal);
student3.borrowResource(audioBook);
student4.borrowResource(eJournal);
```

### Expected Output

When you run the application, you'll see:

```
================= Borrowing Transaction =================
Student Name : Dominic Santos
Student No.  : 22-16901-257
Resource     : Book - (Introduction to Java)
=========================================================

================= Borrowing Transaction =================
Student Name : Lara Mendoza
Student No.  : 22-15678-429
Resource     : Journal - (AI Research Journal)
=========================================================

================= Borrowing Transaction =================
Student Name : Miguel Tan
Student No.  : 22-19988-135
Resource     : Audio Book - (Learn Java by Listening)
=========================================================

================= Borrowing Transaction =================
Student Name : Bianca Reyes
Student No.  : 22-18759-342
Resource     : E-Journal - (Digital Journal of AI Innovations)
=========================================================
```

## 🔧 Extending the Project

### Adding New Resource Types

To add a new resource type (e.g., `Magazine`):

1. **Create** a new class implementing the `Borrowable` interface
2. **Implement** the required methods (`getResourceType()`, `getTitle()`)
3. **Use** the new resource type with existing Student objects

Example:
```java
public class Magazine implements Borrowable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "Magazine";
    }

    @Override
    public String getTitle() {
        return title;
    }
}

// Usage
Borrowable magazine = new Magazine("Tech Weekly");
student1.borrowResource(magazine);
```

### Key Benefits of This Design

- **No Code Changes Required**: Adding new resource types doesn't require modifying the `Student` class
- **Backward Compatibility**: Existing code continues to work without changes
- **Consistent Interface**: All resource types follow the same contract
- **Easy Testing**: Each component can be tested independently

## 🎯 Design Patterns Used

### Dependency Inversion Principle (DIP)
- **Purpose**: High-level modules should not depend on low-level modules; both should depend on abstractions
- **Benefits**: Reduces coupling, increases flexibility, and makes the system more maintainable
- **Implementation**: `Student` class depends on the `Borrowable` interface, not concrete resource classes

### Interface Segregation Principle (ISP)
- **Purpose**: Clients should not be forced to depend on interfaces they do not use
- **Benefits**: Keeps interfaces focused and cohesive
- **Implementation**: `Borrowable` interface contains only methods that all resource types need

### Open/Closed Principle (OCP)
- **Purpose**: Software entities should be open for extension but closed for modification
- **Benefits**: Allows adding new functionality without changing existing code
- **Implementation**: New resource types can be added without modifying the `Student` class

## 🧪 Testing

The `TestProgram` class serves as both a demonstration and validation of the SOLID principles:

- **DIP Validation**: Shows that `Student` can work with any `Borrowable` implementation
- **OCP Validation**: Demonstrates that new resource types work without code changes
- **LSP Validation**: All resource types can be substituted for the `Borrowable` interface
- **SRP Validation**: Each class has a single, well-defined responsibility

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new resource types
- Improving documentation
- Enhancing the SOLID principles implementation
- Adding unit tests
- Suggesting additional features

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and SOLID design patterns best practices. The Dependency Inversion Principle is particularly useful when you want to create flexible, maintainable systems that can easily accommodate new requirements without breaking existing functionality.
