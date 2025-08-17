# Java Design Patterns Portfolio

A comprehensive collection of **Java Design Patterns and SOLID Principles** projects demonstrating advanced software architecture skills, object-oriented design, and enterprise-level programming solutions. This portfolio showcases proficiency in design pattern implementation, code refactoring, system architecture, and software engineering best practices across multiple domains including banking systems, game development, smart home automation, and educational management systems.

## 📋 Overview

This Java Design Patterns Portfolio contains **20+ Java projects** that demonstrate end-to-end software development workflows, from basic SOLID principles to complex design pattern implementations. Each project focuses on real-world applications, showcasing the ability to design robust, maintainable, and scalable software systems using industry-standard design patterns and architectural principles.

## 🏗️ Portfolio Architecture

This portfolio is organized around **thirteen core design pattern categories**, each demonstrating different aspects of software design and architecture:

- **SOLID Design Principles**: Foundation of object-oriented design and clean code
- **Creational Patterns**: Object creation mechanisms and instance management
- **Structural Patterns**: Class and object composition for flexible structures
- **Behavioral Patterns**: Communication between objects and algorithm encapsulation
- **Advanced Patterns**: Complex architectural solutions for enterprise systems

### Software Design Benefits

- **Comprehensive Coverage**: Demonstrates the complete software design process from principles to patterns
- **Domain Expertise**: Shows proficiency across banking, gaming, automation, and educational systems
- **Technical Depth**: Implements advanced patterns like Visitor, Command, and Chain of Responsibility
- **Business Impact**: Focuses on real-world applications with measurable software quality improvements

## 📊 Project Categories

### 🏛️ **SOLID Design Principles**
- **Library Resource Borrowing System**: NEU library system demonstrating inheritance and polymorphism
- **Order Management System**: E-commerce order processing with separation of concerns
- **SOLID Principles Refactoring**: Comprehensive examples of SRP, OCP, ISP, and DIP

### 🔄 **State Design Pattern**
- **Bank Account State Manager**: Bank account with different states (active, suspended, closed)
- **Vending Machine State Manager**: Vending machine with operational states and transitions

### 🔒 **Singleton Design Pattern**
- **Centralized Queue Manager**: Single instance queue management system with thread safety

### 🏢 **Facade Design Pattern**
- **Hotel Management System**: Simplified hotel service interface for guest management
- **Intelligent Home System**: Smart home automation facade for device control

### 🔌 **Adapter Design Pattern**
- **Device Power System**: Power adapter for different device compatibility
- **School Management System**: Legacy system integration with unified interface

### ⚔️ **Strategy Design Pattern**
- **Game Character Combat System**: Character combat strategies with interchangeable algorithms

### 🎨 **Decorator Design Pattern**
- **CIMB Savings Account Manager**: Banking account enhancements with dynamic behavior

### 🚶 **Visitor Design Pattern**
- **Furniture Shipping System**: Shipping cost calculation for different furniture types
- **Telecom Plan Management**: Telecom plan analysis and promotional offer processing

### 📰 **Observer Design Pattern**
- **News Subscription Service**: News agency with publisher-subscriber notifications

### 🌳 **Composite Design Pattern**
- **University Structure Manager**: University organizational hierarchy management

### 🎮 **Command Design Pattern**
- **Smart Home Control System**: Smart home device control with command encapsulation

### 🧬 **Prototype Design Pattern**
- **Animal Registry System**: Animal cloning and registration management
- **Document Registry System**: Document template system with cloning capabilities

### ⛓️ **Chain of Responsibility Design Pattern**
- **Waste Management System**: Waste collection chain processing and classification

## 📁 Project Structure

```
java-design-patterns-portfolio/
├── 01-solid-design-principles/                                     # Foundation of OOP design
│   ├── library-resource-borrowing-system/                          # NEU Library Resource Borrowing System
│   │   ├── src/                                                    # Source code files
│   │   │   ├── Borrowable.java                                     # Interface for borrowable resources
│   │   │   ├── Book.java                                           # Book resource implementation
│   │   │   ├── Journal.java                                        # Journal resource implementation
│   │   │   ├── AudioBook.java                                      # Audio book resource implementation
│   │   │   ├── EJournal.java                                       # Electronic journal implementation
│   │   │   ├── Student.java                                        # Student class with borrowing capability
│   │   │   └── TestProgram.java                                    # Main demonstration program
│   │   └── README.md                                               # Project documentation
│   ├── order-management-system/                                    # Order Management System
│   │   ├── src/                                                    # Source code files
│   │   │   ├── Order.java                                          # Order interface
│   │   │   ├── OrderManager.java                                   # Order management logic
│   │   │   ├── OrderProcessor.java                                 # Order processing implementation
│   │   │   ├── EmailService.java                                   # Email notification service
│   │   │   ├── EmailNotifier.java                                  # Email notification implementation
│   │   │   ├── InvoiceService.java                                 # Invoice generation service
│   │   │   ├── InvoiceGenerator.java                               # Invoice generation implementation
│   │   │   └── OrderTest.java                                      # Main test program
│   │   └── README.md                                               # Project documentation
│   └── solid-principles-refactoring/                               # SOLID Principles Examples
│       ├── src/                                                    # Source code organized by principle
│       │   ├── SRP/                                                # Single Responsibility Principle
│       │   ├── OCP/                                                # Open/Closed Principle
│       │   ├── ISP/                                                # Interface Segregation Principle
│       │   └── DIP/                                                # Dependency Inversion Principle
│       └── README.md                                               # SOLID principles documentation
├── 02-state-design-pattern/                                        # State management patterns
│   ├── bank-account-state-manager/                                 # Bank Account State Manager
│   │   ├── src/                                                    # Source code files
│   │   │   ├── Account.java                                        # Account context class
│   │   │   ├── AccountState.java                                   # State interface
│   │   │   ├── ActiveState.java                                    # Active account state
│   │   │   ├── SuspendedState.java                                 # Suspended account state
│   │   │   ├── ClosedState.java                                    # Closed account state
│   │   │   └── AccountTest.java                                    # Main test program
│   │   └── README.md                                               # Project documentation
│   └── vending-machine-state-manager/                              # Vending Machine State Manager
│       ├── src/                                                    # Source code files
│       │   ├── VendingMachine.java                                 # Vending machine context
│       │   ├── VendingMachineState.java                            # State interface
│       │   ├── IdleState.java                                      # Idle state implementation
│       │   ├── ItemSelectedState.java                              # Item selected state
│       │   ├── DispensingState.java                                # Dispensing state
│       │   ├── OutOfOrderState.java                                # Out of order state
│       │   └── VendingMachineTest.java                             # Main test program
│       └── README.md                                               # Project documentation
├── 03-singleton-design-pattern/                                    # Single instance patterns
│   └── centralized-queue-manager/                                  # Centralized Queue Manager
│       ├── src/                                                    # Source code files
│       │   ├── CentralSystem.java                                  # Singleton central system
│       │   └── HelpDesk.java                                       # Help desk implementation
│       └── README.md                                               # Project documentation
├── 04-facade-design-pattern/                                       # Simplified interface patterns
│   ├── hotel-management-system/                                    # Hotel Management System
│   │   ├── src/                                                    # Source code files
│   │   │   ├── FrontDesk.java                                      # Facade interface
│   │   │   ├── HotelService.java                                   # Service interface
│   │   │   ├── HouseKeeping.java                                   # Housekeeping service
│   │   │   ├── Valet.java                                          # Valet service
│   │   │   ├── Cart.java                                           # Cart service
│   │   │   └── HotelApp.java                                       # Main application
│   │   └── README.md                                               # Project documentation
│   └── intelligent-home-system/                                    # Intelligent Home System
│       ├── src/                                                    # Source code files
│       │   ├── HomeInterface.java                                  # Home interface facade
│       │   ├── HomeService.java                                    # Service interface
│       │   ├── Light.java                                          # Light system
│       │   ├── TV.java                                             # TV system
│       │   ├── AirConditioning.java                                # AC system
│       │   └── HomeApp.java                                        # Main application
│       └── README.md                                               # Project documentation
├── 05-adapter-design-pattern/                                      # Interface adaptation patterns
│   ├── device-power-system/                                        # Device Power Adapter System
│   │   ├── src/                                                    # Source code files
│   │   │   ├── PowerOutlet.java                                    # Power outlet interface
│   │   │   ├── Laptop.java                                         # Laptop device
│   │   │   ├── LaptopAdapter.java                                  # Laptop adapter
│   │   │   ├── Refrigerator.java                                   # Refrigerator device
│   │   │   ├── RefrigeratorAdapter.java                            # Refrigerator adapter
│   │   │   ├── SmartphoneCharger.java                              # Smartphone charger
│   │   │   ├── SmartphoneAdapter.java                              # Smartphone adapter
│   │   │   └── DeviceApp.java                                      # Main application
│   │   └── README.md                                               # Project documentation
│   └── school-management-system/                                   # School Management System
│       ├── src/                                                    # Source code files
│       │   ├── SchoolManagementApp.java                            # Target interface
│       │   ├── AttendanceSystem.java                               # Legacy attendance system
│       │   ├── AttendanceSystemAdapter.java                        # Attendance adapter
│       │   ├── GradingSystem.java                                  # Legacy grading system
│       │   ├── GradingSystemAdapter.java                           # Grading adapter
│       │   ├── LibrarySystem.java                                  # Legacy library system
│       │   ├── LibrarySystemAdapter.java                           # Library adapter
│       │   └── SchoolManagementDemo.java                           # Main application
│       └── README.md                                               # Project documentation
├── 06-strategy-design-pattern/                                     # Algorithm encapsulation patterns
│   └── game-character-combat-system/                               # Game Character Combat System
│       ├── src/                                                    # Source code files
│       │   ├── Character.java                                      # Character context
│       │   ├── AttackStrategy.java                                 # Attack strategy interface
│       │   ├── DefenseStrategy.java                                # Defense strategy interface
│       │   ├── ArcherAttack.java                                   # Archer attack strategy
│       │   ├── ArcherDefense.java                                  # Archer defense strategy
│       │   ├── KnightAttack.java                                   # Knight attack strategy
│       │   ├── KnightDefense.java                                  # Knight defense strategy
│       │   ├── WizardAttack.java                                   # Wizard attack strategy
│       │   ├── WizardDefense.java                                  # Wizard defense strategy
│       │   └── GameApp.java                                        # Main application
│       └── README.md                                               # Project documentation
├── 07-decorator-design-pattern/                                    # Dynamic behavior patterns
│   └── cimb-savings-account-manager/                               # CIMB Savings Account Manager
│       ├── src/                                                    # Source code files
│       │   ├── BankAccount.java                                    # Component interface
│       │   ├── SavingsAccount.java                                 # Concrete component
│       │   ├── BankAccountDecorator.java                           # Decorator abstract class
│       │   ├── CIMB.java                                           # CIMB account decorator
│       │   ├── GSave.java                                          # GSave account decorator
│       │   └── UpSave.java                                         # UpSave account decorator
│       └── README.md                                               # Project documentation
├── 08-visitor-design-pattern/                                      # Algorithm separation patterns
│   ├── furniture-shipping-system/                                  # Furniture Shipping System
│   │   ├── src/                                                    # Source code files
│   │   │   ├── Furniture.java                                      # Furniture interface
│   │   │   ├── Chair.java                                          # Chair implementation
│   │   │   ├── Table.java                                          # Table implementation
│   │   │   ├── Sofa.java                                           # Sofa implementation
│   │   │   ├── ShippingCostVisitor.java                            # Visitor interface
│   │   │   ├── StandardShippingVisitor.java                        # Standard shipping visitor
│   │   │   ├── ExpressShippingVisitor.java                         # Express shipping visitor
│   │   │   ├── DistanceBasedShippingVisitor.java                   # Distance-based shipping visitor
│   │   │   └── FurnitureShipping.java                              # Main application
│   │   └── README.md                                               # Project documentation
│   └── telecom-plan-management-system/                             # Telecom Plan Management System
│       ├── src/                                                    # Source code files
│       │   ├── TelcoSubscription.java                              # Subscription interface
│       │   ├── TelcoAllowance.java                                 # Allowance subscription
│       │   ├── TelcoPromo.java                                     # Promo subscription
│       │   ├── UnliCallTextPackage.java                            # Unlimited package
│       │   ├── UnliCallsTextOffer.java                             # Unlimited offer
│       │   ├── UsagePromo.java                                     # Usage promotion
│       │   └── Telco.java                                          # Main application
│       └── README.md                                               # Project documentation
├── 09-observer-design-pattern/                                     # Event notification patterns
│   └── news-subscription-service-system/                           # News Subscription Service System
│       ├── src/                                                    # Source code files
│       │   ├── NewsAgencySubject.java                              # Subject interface
│       │   ├── NewsAgency.java                                     # News agency implementation
│       │   ├── SubscriberObserver.java                             # Observer interface
│       │   ├── Subscriber.java                                     # Subscriber implementation
│       │   └── NewsSubscriptionDemo.java                           # Main application
│       └── README.md                                               # Project documentation
├── 10-composite-design-pattern/                                    # Tree structure patterns
│   └── university-structure-manager/                               # University Structure Manager
│       ├── src/                                                    # Source code files
│       │   ├── UniversityComponent.java                            # Component interface
│       │   ├── University.java                                     # University composite
│       │   ├── College.java                                        # College composite
│       │   ├── Department.java                                     # Department composite
│       │   ├── Student.java                                        # Student leaf
│       │   ├── Teacher.java                                        # Teacher leaf
│       │   └── Client.java                                         # Main application
│       └── README.md                                               # Project documentation
├── 11-command-design-pattern/                                      # Request encapsulation patterns
│   └── smart-home-control-system/                                  # Smart Home Control System
│       ├── src/                                                    # Source code files
│       │   ├── Command.java                                        # Command interface
│       │   ├── Device.java                                         # Device interface
│       │   ├── LightSystem.java                                    # Light system device
│       │   ├── MusicSystem.java                                    # Music system device
│       │   ├── Thermostat.java                                     # Thermostat device
│       │   ├── TurnOn.java                                         # Turn on command
│       │   ├── TurnOff.java                                        # Turn off command
│       │   ├── IncreaseSetting.java                                # Increase setting command
│       │   ├── DecreaseSetting.java                                # Decrease setting command
│       │   ├── ChangePlaylist.java                                 # Change playlist command
│       │   ├── Control.java                                        # Control interface
│       │   └── CentralHub.java                                     # Main application
│       └── README.md                                               # Project documentation
├── 12-prototype-design-pattern/                                    # Object cloning patterns
│   ├── animal-registry-system/                                     # Animal Registry System
│   │   ├── src/                                                    # Source code files
│   │   │   ├── Animal.java                                         # Animal interface
│   │   │   ├── Cow.java                                            # Cow implementation
│   │   │   ├── Horse.java                                          # Horse implementation
│   │   │   ├── Sheep.java                                          # Sheep implementation
│   │   │   ├── AnimalRegistry.java                                 # Registry implementation
│   │   │   └── TestAnimal.java                                     # Main application
│   │   └── README.md                                               # Project documentation
│   └── document-registry-system/                                   # Document Registry System
│       ├── src/                                                    # Source code files
│       │   ├── Document.java                                       # Document interface
│       │   ├── TextDocument.java                                   # Text document implementation
│       │   ├── PdfDocument.java                                    # PDF document implementation
│       │   ├── SpreadsheetDocument.java                            # Spreadsheet document implementation
│       │   ├── ProcessedDocument.java                              # Processed document implementation
│       │   ├── DocumentRegistry.java                               # Registry implementation
│       │   └── Main.java                                           # Main application
│       └── README.md                                               # Project documentation
└── 13-chain-of-responsibility-design-pattern/                      # Request chain patterns
    └── waste-management-system/                                    # Waste Management System
        ├── src/                                                    # Source code files
        │   ├── CollectionChain.java                                # Handler interface
        │   ├── GeneralCollection.java                              # General waste handler
        │   ├── OrganicCollection.java                              # Organic waste handler
        │   ├── RecyclableCollection.java                           # Recyclable waste handler
        │   ├── HazardousCollection.java                            # Hazardous waste handler
        │   ├── WasteContainer.java                                 # Waste container class
        │   └── WasteManagement.java                                # Main application
        └── README.md                                               # Project documentation
```

## 🛠️ Technologies & Tools

### Core Technologies
- **Java**: Primary programming language for object-oriented design
- **Java Development Kit (JDK)**: Version 8 or higher for modern Java features
- **Object-Oriented Programming**: Classes, interfaces, inheritance, polymorphism
- **Design Patterns**: Gang of Four (GoF) design patterns implementation

### Advanced Concepts
- **SOLID Principles**: Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion
- **UML Diagrams**: Class diagrams and sequence diagrams for system design
- **Software Architecture**: Layered architecture and component design
- **Code Quality**: Clean code principles and refactoring techniques

## 📊 Key Skills Demonstrated

### Object-Oriented Design
- **Class Design**: Proper encapsulation, inheritance, and polymorphism
- **Interface Design**: Clean interfaces following SOLID principles
- **Design Patterns**: Implementation of 13 essential design patterns
- **Code Organization**: Logical package structure and naming conventions

### Software Architecture
- **System Design**: Scalable and maintainable architecture
- **Component Integration**: Seamless integration of different system components
- **Dependency Management**: Proper dependency injection and inversion
- **Error Handling**: Robust error handling and exception management

### Problem Solving
- **Real-World Applications**: Practical implementation of design patterns
- **System Integration**: Legacy system integration and modernization
- **Performance Optimization**: Efficient algorithms and data structures
- **User Experience**: Intuitive interfaces and user-friendly applications

### Code Quality
- **Clean Code**: Readable, maintainable, and well-documented code
- **Testing**: Comprehensive testing and validation
- **Documentation**: Detailed README files and code comments
- **Best Practices**: Industry-standard coding practices and conventions

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **Any Java IDE** (IntelliJ IDEA, Eclipse, VS Code, etc.) or command line
- **Basic Java knowledge** (classes, interfaces, inheritance, polymorphism)
- **Git** for version control

### Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/YOUR_USERNAME/java-design-patterns-portfolio.git
   cd java-design-patterns-portfolio
   ```

2. **Choose a project** from the categories above

3. **Navigate to the project directory**:
   ```bash
   cd <pattern-directory>/<project-name>/src
   ```

4. **Compile and run**:
   ```bash
   javac *.java
   java <MainClass>
   ```

### Example: Running the Library System

```bash
cd 01-solid-design-principles/library-resource-borrowing-system/src
javac *.java
java TestProgram
```

### Example: Running the School Management System

```bash
cd 05-adapter-design-pattern/school-management-system/src
javac *.java
java SchoolManagementDemo
```

## 📈 Project Highlights

### 🏛️ **SOLID Principles Implementation**
The `01-solid-design-principles/` directory demonstrates foundational object-oriented design:
- **Library Resource Borrowing System**: Shows inheritance and polymorphism with different resource types
- **Order Management System**: Demonstrates separation of concerns with order processing, notifications, and invoicing
- **SOLID Principles Refactoring**: Comprehensive examples of each SOLID principle with before/after comparisons

### 🔄 **State Pattern Applications**
The `02-state-design-pattern/` projects showcase state management:
- **Bank Account State Manager**: Demonstrates account state transitions (active, suspended, closed) with proper state encapsulation
- **Vending Machine State Manager**: Shows operational states (idle, item selected, dispensing, out of order) with state-specific behavior

### 🔌 **Adapter Pattern Solutions**
The `05-adapter-design-pattern/` projects demonstrate legacy system integration:
- **School Management System**: Integrates multiple legacy systems (attendance, grading, library) through adapters
- **Device Power System**: Shows power compatibility between different device types using adapter pattern

### 🎮 **Strategy Pattern Implementation**
The `06-strategy-design-pattern/game-character-combat-system/` demonstrates algorithm encapsulation:
- **Game Character Combat**: Implements interchangeable attack and defense strategies for different character types
- **Dynamic Behavior**: Shows how strategies can be changed at runtime without modifying existing code

### 📰 **Observer Pattern Applications**
The `09-observer-design-pattern/news-subscription-service-system/` demonstrates event-driven programming:
- **News Subscription Service**: Implements publisher-subscriber pattern with news agency and subscribers
- **Event Notification**: Shows loose coupling between subject and observers

## 🔧 Extending the Portfolio

### Adding New Projects

To add new design pattern projects:

1. **Create** a new directory with descriptive naming following the established pattern
2. **Implement** the design pattern with real-world application
3. **Include** comprehensive documentation and UML diagrams
4. **Add** the project to the appropriate category in this README
5. **Update** the project structure section

### Best Practices

- **Documentation**: Include detailed explanations of pattern implementation and benefits
- **Real-World Context**: Focus on practical applications rather than academic examples
- **Code Quality**: Follow clean code principles and proper naming conventions
- **Testing**: Ensure all code compiles and runs correctly
- **UML Diagrams**: Include class diagrams for complex pattern implementations

## 🎯 Software Design Methodologies Used

### Design Pattern Implementation
- **Problem Identification**: Recognizing when to apply specific design patterns
- **Pattern Selection**: Choosing the most appropriate pattern for the problem
- **Implementation**: Proper implementation following pattern guidelines
- **Validation**: Ensuring the pattern solves the intended problem

### SOLID Principles Application
- **Single Responsibility**: Each class has one reason to change
- **Open/Closed**: Open for extension, closed for modification
- **Liskov Substitution**: Subtypes are substitutable for their base types
- **Interface Segregation**: Clients depend only on interfaces they use
- **Dependency Inversion**: Depend on abstractions, not concretions

### Code Refactoring Techniques
- **Extract Method**: Breaking down large methods into smaller, focused ones
- **Extract Class**: Separating responsibilities into different classes
- **Replace Inheritance with Composition**: Using composition over inheritance
- **Introduce Design Patterns**: Applying patterns to improve code structure

## 🤝 Contributing

Contributions to enhance this portfolio are welcome! Areas for improvement include:

- **New Patterns**: Adding projects for additional design patterns
- **Documentation**: Improving explanations and adding more detailed comments
- **Code Quality**: Optimizing performance and following best practices
- **UML Diagrams**: Creating more comprehensive system diagrams
- **Real-World Applications**: Adding more practical business use cases

## 📄 License

This portfolio is open source and available under the [MIT License](LICENSE).

---

**Note**: This portfolio demonstrates proficiency in modern software design techniques and patterns. Each project focuses on real-world applications, showcasing the ability to design robust, maintainable, and scalable software systems using industry-standard design patterns and architectural principles. The projects range from fundamental SOLID principles to advanced behavioral patterns, providing a comprehensive view of software design capabilities across multiple domains.
