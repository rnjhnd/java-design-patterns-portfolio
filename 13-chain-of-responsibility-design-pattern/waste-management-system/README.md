# Waste Management System

A Java implementation of the **Chain of Responsibility Design Pattern** for waste collection management. This project demonstrates how to use a chain of specialized handlers to process different types of waste containers.

## 📋 Overview

The Waste Management System shows how different types of waste containers can be automatically routed to the appropriate collection handler. Instead of manually checking each container's type, the system uses a chain of responsibility to automatically direct containers to the right handler.

## 🏗️ Architecture

This project implements the **Chain of Responsibility Design Pattern** with the following components:

- **CollectionChain Interface**: Defines the contract for all waste collection handlers
- **WasteCollectionChain**: Main coordinator that manages the chain of handlers
- **Specialized Handlers**: Organic, Recyclable, Hazardous, and General waste collection implementations
- **WasteContainer**: Simple container model that stores waste information

### Design Pattern Benefits

- **Separation of Concerns**: Each handler specializes in a specific waste type
- **Flexibility**: Easy to add new waste types by creating new handlers
- **Maintainability**: Clear responsibility boundaries and modular design
- **Extensibility**: Chain can be easily modified without affecting existing handlers

## 📊 UML Class Diagram

```
┌─────────────────────────────────────────────────────────────────────────────────────┐
│                           Waste Management System                                   │
│                    Chain of Responsibility Pattern                                  │
└─────────────────────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────────────────────┐
│                              WasteManagement                                        │
├─────────────────────────────────────────────────────────────────────────────────────┤
│ + {static} main(String[] args): void                                                │
└─────────────────────────────────────────────────────────────────────────────────────┘
                                        │
                                        │ creates
                                        ▼
┌─────────────────────────────────────────────────────────────────────────────────────┐
│                              WasteContainer                                         │
├─────────────────────────────────────────────────────────────────────────────────────┤
│ - type: String                                                                      │
│ - capacity: int                                                                     │
│ - location: String                                                                  │
├─────────────────────────────────────────────────────────────────────────────────────┤
│ + WasteContainer(type: String, capacity: int, location: String)                     │
│ + getType(): String                                                                 │
│ + getCapacity(): int                                                                │
│ + getLocation(): String                                                             │
│ + toString(): String                                                                │
└─────────────────────────────────────────────────────────────────────────────────────┘
                                        │
                                        │ processes
                                        ▼
┌─────────────────────────────────────────────────────────────────────────────────────┐
│                           WasteCollectionChain                                      │
├─────────────────────────────────────────────────────────────────────────────────────┤
│ - firstHandler: CollectionChain                                                     │
├─────────────────────────────────────────────────────────────────────────────────────┤
│ + WasteCollectionChain()                                                            │
│ + collect(container: WasteContainer): void                                          │
└─────────────────────────────────────────────────────────────────────────────────────┘
                                        │
                                        │ manages
                                        ▼
┌─────────────────────────────────────────────────────────────────────────────────────┐
│                            <<interface>>                                            │
│                           CollectionChain                                           │
├─────────────────────────────────────────────────────────────────────────────────────┤
│ + setNextChain(nextChain: CollectionChain): void                                    │
│ + collect(container: WasteContainer): void                                          │
└─────────────────────────────────────────────────────────────────────────────────────┘
                                        │
                                        │ implements
                                        │
              ┌─────────────────────────┼───────────────────────────┐
              │                         │                           │
              ▼                         ▼                           ▼
┌─────────────────────────┐ ┌─────────────────────────┐ ┌─────────────────────────┐
│    OrganicCollection    │ │   RecyclableCollection  │ │   HazardousCollection   │
├─────────────────────────┤ ├─────────────────────────┤ ├─────────────────────────┤
│ - nextChain: Collection │ │ - nextChain: Collection │ │ - nextChain: Collection │
│   Chain                 │ │   Chain                 │ │   Chain                 │
├─────────────────────────┤ ├─────────────────────────┤ ├─────────────────────────┤
│ + setNextChain(nextChain│ │ + setNextChain(nextChain│ │ + setNextChain(nextChain│
│   : CollectionChain):   │ │   : CollectionChain):   │ │   : CollectionChain):   │
│   void                  │ │   void                  │ │   void                  │
│ + collect(container:    │ │ + collect(container:    │ │ + collect(container:    │
│   WasteContainer): void │ │   WasteContainer): void │ │   WasteContainer): void │
└─────────────────────────┘ └─────────────────────────┘ └─────────────────────────┘
             │                          │                            │
             │ setNextChain()           │ setNextChain()             │ setNextChain()
             ▼                          ▼                            ▼
┌─────────────────────────────────────────────────────────────────────────────────────┐
│                           GeneralCollection                                         │
├─────────────────────────────────────────────────────────────────────────────────────┤
│ + setNextChain(nextChain: CollectionChain): void                                    │
│ + collect(container: WasteContainer): void                                          │
└─────────────────────────────────────────────────────────────────────────────────────┘

Chain Flow: OrganicCollection → RecyclableCollection → HazardousCollection → GeneralCollection
```

The following diagram illustrates:
- The architecture of the Waste Management System
- Relationships between the core components:
  - The `CollectionChain` interface defining the contract for all handlers
  - Concrete implementations: `OrganicCollection`, `RecyclableCollection`, `HazardousCollection`, `GeneralCollection`
  - The `WasteCollectionChain` coordinator that manages the chain
  - The `WasteContainer` model representing waste containers
  - The `WasteManagement` main class that demonstrates the pattern
- How the Chain of Responsibility design pattern is applied in this project

## 🚀 Features

- **Multiple Waste Types**: Support for Organic, Recyclable, Hazardous, and General waste
- **Chain of Responsibility**: Automatic routing to appropriate handlers
- **Simple Container Model**: Basic waste container with type, capacity, and location
- **Easy to Understand**: Clean, simple code that demonstrates the pattern clearly
- **Educational**: Perfect for learning design patterns

## 📁 Project Structure

```
waste-management-system/
├── src/
│   ├── CollectionChain.java              # Handler interface
│   ├── WasteCollectionChain.java         # Main coordinator
│   ├── WasteContainer.java               # Simple container model
│   ├── OrganicCollection.java            # Organic waste handler
│   ├── RecyclableCollection.java         # Recyclable waste handler
│   ├── HazardousCollection.java          # Hazardous waste handler
│   ├── GeneralCollection.java            # General waste handler
│   └── WasteManagement.java              # Main application demo
└── README.md                             # Project documentation
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
   java -cp src WasteManagement
   ```

## 📖 Usage

### Basic Usage

The main application (`src/WasteManagement.java`) demonstrates how to use the chain of responsibility pattern:

```java
// Create the waste collection chain
WasteCollectionChain chain = new WasteCollectionChain();

// Create a waste container
WasteContainer container = new WasteContainer("organic", 20, "Downtown Park");

// Process the container through the chain
chain.collect(container);
```

### Expected Output

When you run the application, you'll see:

```
=============================================
========== Waste Management System ==========
=============================================
Waste Collection Chain created successfully!

--- Processing Containers ---
Processing container: WasteContainer{type='organic', capacity=10, location='Downtown Park'}
Collecting organic waste from Downtown Park
Capacity: 10
Processing for composting...
Collection completed!

Processing container: WasteContainer{type='recyclable', capacity=20, location='Shopping Mall'}
Collecting recyclable waste from Shopping Mall
Capacity: 20
Processing for recycling...
Collection completed!

Processing container: WasteContainer{type='hazardous', capacity=5, location='Industrial Zone'}
Collecting hazardous waste from Industrial Zone
Capacity: 5
WARNING: Special safety procedures required!
Processing for safe disposal...
Collection completed!

Processing container: WasteContainer{type='general', capacity=15, location='Residential Area'}
Collecting general waste from Residential Area
Type: general
Capacity: 15
Processing for landfill disposal...
Collection completed!
```

## 🔧 Extending the Project

### Adding New Waste Types

To add a new waste type (e.g., `ElectronicWaste`):

1. **Create** a new class implementing the `CollectionChain` interface in the `src/` folder
2. **Add** the handler to `WasteCollectionChain` initialization
3. **Implement** the required methods (`collect()`, `setNextChain()`)

Example:
```java
// src/ElectronicWasteCollection.java
public class ElectronicWasteCollection implements CollectionChain {
    private CollectionChain nextChain;
    
    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.nextChain = nextChain;
    }
    
    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equals("electronic")) {
            System.out.println("Collecting electronic waste from " + container.getLocation());
            System.out.println("Processing for electronic recycling...");
        } else {
            if (nextChain != null) {
                nextChain.collect(container);
            }
        }
    }
}
```

## 🎯 Design Patterns Used

### Chain of Responsibility Pattern
- **Purpose**: Pass requests along a chain of handlers until one handles it
- **Benefits**: Decouples request sender from request handlers
- **Implementation**: Each handler can either process the request or pass it to the next handler

### How It Works
1. A request (waste container) is sent to the first handler in the chain
2. Each handler checks if it can process the request
3. If it can, it processes the request
4. If it can't, it passes the request to the next handler
5. This continues until a handler processes the request or the chain ends

## ✨ Benefits

### For Learning
- **Clear Pattern**: Easy to understand implementation of Chain of Responsibility
- **Simple Code**: No complex features that distract from the pattern
- **Educational**: Perfect for students learning design patterns
- **Extensible**: Easy to modify and extend

### For Understanding Design Patterns
- **Separation of Concerns**: Each handler has a single responsibility
- **Loose Coupling**: Handlers don't need to know about each other
- **Open/Closed Principle**: Easy to add new handlers without modifying existing code
- **Single Responsibility**: Each class has one clear purpose

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new waste types and handlers in the `src/` folder
- Improving documentation
- Enhancing the chain of responsibility implementation
- Adding comments to make the code more educational

## 📈 Future Enhancements

- **More Waste Types**: Add handlers for electronic waste, medical waste, etc.
- **GUI Interface**: Simple graphical interface to demonstrate the pattern
- **Animation**: Visual representation of how the chain works
- **Interactive Demo**: Allow users to create their own containers and see the chain in action

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and design patterns best practices. The Chain of Responsibility pattern is particularly useful when you have a series of handlers that can process a request, and you want to decouple the sender from the receivers while allowing multiple objects to handle the request.
