# SOLID Principles Refactoring Exercises

A Java implementation demonstrating the **SOLID Principles** through practical refactoring exercises. This project showcases how to transform code that violates SOLID principles into clean, maintainable, and extensible solutions.

## 📋 Overview

The SOLID Principles Refactoring Exercises provide hands-on examples of applying the five fundamental principles of object-oriented design:

- **S**ingle Responsibility Principle (SRP)
- **O**pen/Closed Principle (OCP) 
- **L**iskov Substitution Principle (LSP)
- **I**nterface Segregation Principle (ISP)
- **D**ependency Inversion Principle (DIP)

Each principle is demonstrated through before-and-after code examples, showing common violations and their proper implementations.

## 🏗️ Architecture

This project is organized into four main modules, each focusing on a specific **SOLID design principle**:

- **SRP Module**: Demonstrates separation of concerns by splitting responsibilities
- **OCP Module**: Shows how to extend functionality without modifying existing code
- **ISP Module**: Illustrates proper interface design to avoid forcing unnecessary implementations
- **DIP Module**: Demonstrates dependency inversion for loose coupling

### Design Pattern Benefits

- **Maintainability**: Code is easier to understand, modify, and extend
- **Testability**: Components can be tested in isolation
- **Flexibility**: New features can be added without breaking existing code
- **Reusability**: Components can be reused across different contexts
- **Scalability**: Architecture supports growth and evolution

## 🚀 Features

- **Four SOLID Principles**: Complete implementations of SRP, OCP, ISP, and DIP
- **Before/After Examples**: Clear demonstrations of violations and solutions
- **Practical Scenarios**: Real-world examples like payment processing and phone interfaces
- **Clean Architecture**: Well-structured, maintainable code following best practices
- **Educational Focus**: Designed for learning and understanding SOLID principles

## 📁 Project Structure

```
solid-principles-refactoring/
├── single-responsibility-principle/              # Single Responsibility Principle
│   ├── src/                                      # Source code files
│   │   ├── Pet.java                              # Pet entity class
│   │   ├── PetActions.java                       # Actions interface
│   │   ├── Dog.java                              # Dog implementation
│   │   ├── Cat.java                              # Cat implementation
│   │   └── PetDemo.java                          # SRP demonstration
│   └── README.md                                 # Problem statement
├── open-closed-principle/                        # Open/Closed Principle
│   ├── src/                                      # Source code files
│   │   ├── Customer.java                         # Customer class with strategy pattern
│   │   ├── DiscountHandler.java                  # Discount strategy interface
│   │   ├── Student.java                          # Student discount strategy
│   │   ├── SeniorCitizen.java                    # Senior citizen discount strategy
│   │   ├── Regular.java                          # Regular customer strategy
│   │   └── DiscountDemo.java                     # OCP demonstration
│   └── README.md                                 # Problem statement
├── interface-segregation-principle/              # Interface Segregation Principle
│   ├── src/                                      # Source code files
│   │   ├── CallingFunctionality.java             # Calling interface
│   │   ├── MessagingFunctionality.java           # Messaging interface
│   │   ├── WebBrowsingFunctionality.java         # Web browsing interface
│   │   ├── ImageCapturingFunctionality.java      # Camera interface
│   │   ├── BasicPhone.java                       # Basic phone implementation
│   │   ├── Samsung.java                          # Samsung smartphone implementation
│   │   ├── IPhone.java                           # iPhone implementation
│   │   └── PhoneDemo.java                        # ISP demonstration
│   └── README.md                                 # Problem statement
├── dependency-inversion-principle/               # Dependency Inversion Principle
│   ├── src/                                      # Source code files
│   │   ├── PaymentMethod.java                    # Payment method interface
│   │   ├── PaymentProcessor.java                 # Payment processor with dependency injection
│   │   ├── CashPayment.java                      # Cash payment implementation
│   │   ├── CreditCardPayment.java                # Credit card payment implementation
│   │   ├── EWalletPayment.java                   # E-wallet payment implementation
│   │   └── PaymentDemo.java                      # DIP demonstration
│   └── README.md                                 # Problem statement
└── README.md                                     # Project documentation
```

## 🛠️ Installation & Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Getting Started

1. **Clone or download** the project files
2. **Navigate** to the project directory
3. **Compile** the Java files for each principle:
   ```bash
   # Single Responsibility Principle
   javac single-responsibility-principle/src/*.java
   
   # Open/Closed Principle
   javac open-closed-principle/src/*.java
   
   # Interface Segregation Principle
   javac interface-segregation-principle/src/*.java
   
   # Dependency Inversion Principle
   javac dependency-inversion-principle/src/*.java
   ```
4. **Run** individual demonstrations:
   ```bash
   # SRP Demo
   java -cp single-responsibility-principle/src PetDemo
   
   # OCP Demo
   java -cp open-closed-principle/src DiscountDemo
   
   # ISP Demo
   java -cp interface-segregation-principle/src PhoneDemo
   
   # DIP Demo
   java -cp dependency-inversion-principle/src PaymentDemo
   ```

## 📖 Usage

### Single Responsibility Principle (SRP)

**Problem**: A single class handling multiple responsibilities (pet data and actions)

**Solution**: Separate data management from behavior

```java
// Pet class handles only data
Pet pet = new Pet("Skittle", "Stephen");

// PetActions interface handles behavior
PetActions dog = new Dog();
System.out.println(dog.makeSound());
System.out.println(dog.eat());
```

### Open/Closed Principle (OCP)

**Problem**: Customer class with hardcoded discount logic

**Solution**: Strategy pattern for extensible discount types

```java
// Extensible without modifying existing code
Customer senior = new Customer("LeBron", new SeniorCitizen());
Customer student = new Customer("Austin", new Student());
Customer regular = new Customer("Luka", new Regular());

double amount = 150.0;
System.out.println("Senior discount: ₱" + senior.applyDiscount(amount));
```

### Interface Segregation Principle (ISP)

**Problem**: Large interface forcing unnecessary implementations

**Solution**: Segregated interfaces for specific functionalities

```java
// Basic phone only implements needed interfaces
BasicPhone basicPhone = new BasicPhone();
basicPhone.makeCall("0917 123 4567");
basicPhone.sendSMS("0927 456 1234", "Hello!");

// Smartphone implements all interfaces
Samsung samsung = new Samsung();
samsung.makeCall("0938 654 0987");
samsung.browseWeb("https://www.samsung.com");
samsung.takePicture();
```

### Dependency Inversion Principle (DIP)

**Problem**: High-level module depending on low-level modules

**Solution**: Dependency injection with abstractions

```java
// Payment processor depends on abstraction
PaymentProcessor ewalletProcessor = new PaymentProcessor(new EWalletPayment());
PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
PaymentProcessor cashProcessor = new PaymentProcessor(new CashPayment());

ewalletProcessor.processPayment(500.0);
creditCardProcessor.processPayment(2500.0);
cashProcessor.processPayment(300.0);
```

## 🔧 Extending the Project

### Adding New Discount Types (OCP)

To add a new customer type with different discount logic:

1. **Create** a new class implementing `DiscountHandler`
2. **Implement** the `calculateDiscount()` method
3. **Use** the new type without modifying existing code

```java
public class VIPCustomer implements DiscountHandler {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15; // 15% discount for VIP
    }
}

// Usage
Customer vip = new Customer("VIP User", new VIPCustomer());
```

### Adding New Payment Methods (DIP)

To add a new payment method:

1. **Create** a new class implementing `PaymentMethod`
2. **Implement** the `processPayment()` method
3. **Inject** the new payment method into the processor

```java
public class CryptoPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing crypto payment: ₱" + amount);
    }
}

// Usage
PaymentProcessor cryptoProcessor = new PaymentProcessor(new CryptoPayment());
cryptoProcessor.processPayment(1000.0);
```

## 🎯 SOLID Principles Explained

### Single Responsibility Principle (SRP)
- **Definition**: A class should have only one reason to change
- **Benefits**: Easier maintenance, testing, and understanding
- **Implementation**: Separate data classes from behavior classes

### Open/Closed Principle (OCP)
- **Definition**: Software entities should be open for extension but closed for modification
- **Benefits**: New features can be added without breaking existing code
- **Implementation**: Use strategy pattern, inheritance, or composition

### Interface Segregation Principle (ISP)
- **Definition**: Clients should not be forced to depend on interfaces they don't use
- **Benefits**: Prevents unnecessary dependencies and method implementations
- **Implementation**: Create small, focused interfaces instead of large ones

### Dependency Inversion Principle (DIP)
- **Definition**: High-level modules should not depend on low-level modules; both should depend on abstractions
- **Benefits**: Loose coupling, easier testing, and flexibility
- **Implementation**: Use dependency injection and abstract interfaces

## 📋 Naming Conventions

This project follows standard Java naming conventions:

- **Class names**: Nouns (singular), start with capital letters
- **Method names**: Verbs, start with lowercase letters
- **Attribute names**: Start with lowercase letters
- **Package names**: Lowercase, descriptive

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding more SOLID principle examples
- Improving existing implementations
- Adding unit tests
- Enhancing documentation
- Creating additional design pattern examples

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and SOLID design best practices. These principles are fundamental to creating maintainable, scalable, and robust software systems. Understanding and applying SOLID principles is essential for any software developer working with object-oriented programming.
