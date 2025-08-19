# Document Registry System

A Java implementation of the **Prototype Design Pattern** for efficient document creation and management. This project demonstrates how to use prototype objects to create new document instances without the overhead of complex initialization.

## 📋 Overview

The Document Registry System allows you to create different types of documents (PDF, Text, and Spreadsheet) using pre-configured prototypes. Instead of creating new document instances from scratch each time, the system clones existing prototype objects, making document creation more efficient and consistent.

## 🏗️ Architecture

This project implements the **Prototype Design Pattern** with the following components:

- **Document Interface**: Defines the contract for all document types
- **Document Registry**: Manages prototype instances and provides factory methods
- **Concrete Document Classes**: PDF, Text, and Spreadsheet document implementations
- **Main Application**: Demonstrates the prototype pattern in action

### Design Pattern Benefits

- **Performance**: Avoids expensive initialization by cloning existing objects
- **Flexibility**: Easy to create new document types by adding new prototypes
- **Consistency**: Ensures all documents of the same type have consistent base properties
- **Memory Efficiency**: Reduces object creation overhead

## 📊 UML Class Diagram

![image](https://github.com/user-attachments/assets/c49aa490-6d33-4491-9773-d45630d54481)
<img width="1980" height="670" alt="image" src="https://github.com/user-attachments/assets/743f5a30-b848-4ea4-ae9e-fd1400bfe2d9" />


The following diagram illustrates:
- The architecture of the Document Registry System
- Relationships between the core components:
  - The `Document` interface
  - Concrete implementations: `PdfDocument`, `TextDocument`, `SpreadsheetDocument`
  - The `DocumentRegistry` for managing prototypes
  - The main application class
- How the Prototype design pattern is applied in this project

## 🚀 Features

- **Multiple Document Types**: Support for PDF, Text, and Spreadsheet documents
- **Prototype Cloning**: Efficient document creation through object cloning
- **Type-Safe Operations**: Strong typing for each document type
- **Extensible Design**: Easy to add new document types
- **Clean Architecture**: Well-structured, maintainable code

## 📁 Project Structure

```
document-registry-system/
├── src/
│   ├── Document.java                  # Document interface
│   ├── DocumentRegistry.java          # Prototype registry and factory
│   ├── PdfDocument.java               # PDF document implementation
│   ├── TextDocument.java              # Text document implementation
│   ├── SpreadsheetDocument.java       # Spreadsheet document implementation
│   └── ProcessedDocument.java         # Main application demo
└── README.md                          # Project documentation
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
   java -cp src ProcessedDocument
   ```

## 📖 Usage

### Basic Usage

The main application (`ProcessedDocument.java`) demonstrates how to use the prototype pattern:

```java
// Create the document registry with prototypes
DocumentRegistry registry = new DocumentRegistry();

// Create a PDF document from prototype
PdfDocument pdf = registry.createPdfDocument();
pdf.setFileName("report.pdf");
pdf.setAuthor("John Doe");
pdf.setPageCount(50);
pdf.open();

// Create a text document from prototype
TextDocument text = registry.createTextDocument();
text.setFilePath("notes.txt");
text.setEncoding("UTF-8");
text.setWordCount(1000);
text.open();
```

### Expected Output

When you run the application, you'll see:

```
Creating a PDF Document prototype.
Creating a Text Document prototype.
Creating a Spreadsheet Document prototype.

Opening PDF Document: annual_report_2024.pdf by Acme Corp (150 pages)
Type: PDF, File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150

Opening Text Document: meeting_notes.txt with encoding: UTF-8 (250 words)
Type: Text, Path: meeting_notes.txt, Encoding: UTF-8, Words: 250

Opening Spreadsheet Document: sales_data_q1.xlsx (1000 rows, 20 columns)
Type: Spreadsheet, Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20

Opening PDF Document: summary_report.pdf by Acme Corp (30 pages)
Type: PDF, File: summary_report.pdf, Author: Acme Corp, Pages: 30
```

## 🔧 Extending the Project

### Adding New Document Types

To add a new document type (e.g., `ImageDocument`):

1. **Create** a new class implementing the `Document` interface
2. **Add** the prototype to `DocumentRegistry`
3. **Implement** the required methods (`clone()`, `open()`, `getType()`)

Example:
```java
public class ImageDocument implements Document {
    private String imagePath;
    private String format;
    private int width;
    private int height;
    
    // Implementation details...
}
```

## 🎯 Design Patterns Used

### Prototype Pattern
- **Purpose**: Create new objects by cloning existing prototypes
- **Benefits**: Reduces initialization overhead and ensures consistency
- **Implementation**: Each document class implements `Cloneable` and provides a `clone()` method

### Factory Pattern (Registry)
- **Purpose**: Centralized creation of document instances
- **Benefits**: Encapsulates object creation logic and provides a clean API
- **Implementation**: `DocumentRegistry` manages prototypes and provides factory methods

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new document types
- Improving documentation
- Enhancing the prototype pattern implementation
- Adding unit tests

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and design patterns best practices. The Prototype pattern is particularly useful when object creation is expensive, when you want to avoid building a class hierarchy of factories, or when instances of a class can have only a few different combinations of state.
