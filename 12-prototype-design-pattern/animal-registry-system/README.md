# Animal Registry System

A Java implementation of the **Prototype Design Pattern** for efficient animal creation and management. This project demonstrates how to use prototype objects to create new animal instances without the overhead of complex initialization.

## 📋 Overview

The Animal Registry System allows you to create different types of animals (Sheep, Cow, and Horse) using pre-configured prototypes. Instead of creating new animal instances from scratch each time, the system clones existing prototype objects, making animal creation more efficient and consistent.

## 🏗️ Architecture

This project implements the **Prototype Design Pattern** with the following components:

- **Animal Interface**: Defines the contract for all animal types with cloning capability
- **Animal Registry**: Manages prototype instances and provides factory methods
- **Concrete Animal Classes**: Sheep, Cow, and Horse implementations
- **Test Application**: Demonstrates the prototype pattern in action

### Design Pattern Benefits

- **Performance**: Avoids expensive initialization by cloning existing objects
- **Flexibility**: Easy to create new animal types by adding new prototypes
- **Consistency**: Ensures all animals of the same type have consistent base properties
- **Memory Efficiency**: Reduces object creation overhead

## 📊 UML Class Diagram

<img width="1348" height="573" alt="image" src="https://github.com/user-attachments/assets/005fa2a4-0698-48df-b9c7-356bbace97be" />

The following diagram illustrates:
- The architecture of the Animal Registry System
- Relationships between the core components:
  - The `Animal` interface
  - Concrete implementations: `Sheep`, `Cow`, `Horse`
  - The `AnimalRegistry` for managing prototypes
  - The main test application class
- How the Prototype design pattern is applied in this project

## 🚀 Features

- **Multiple Animal Types**: Support for Sheep, Cow, and Horse animals
- **Prototype Cloning**: Efficient animal creation through object cloning
- **Type-Safe Operations**: Strong typing for each animal type
- **Extensible Design**: Easy to add new animal types
- **Clean Architecture**: Well-structured, maintainable code

## 📁 Project Structure

```
animal-registry-system/
├── src/
│   ├── Animal.java                    # Animal interface
│   ├── AnimalRegistry.java            # Prototype registry and factory
│   ├── Sheep.java                     # Sheep animal implementation
│   ├── Cow.java                       # Cow animal implementation
│   ├── Horse.java                     # Horse animal implementation
│   └── TestAnimal.java                # Main application demo
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
   java -cp src TestAnimal
   ```

## 📖 Usage

### Basic Usage

The main application (`TestAnimal.java`) demonstrates how to use the prototype pattern:

```java
// Create the animal registry with prototypes
AnimalRegistry registry = new AnimalRegistry();

// Create a sheep from prototype
Animal fluffy = registry.createSheep("Fluffy");
fluffy.makeSound();

// Create a cow from prototype
Animal bessy = registry.createCow();
bessy.makeSound();

// Create a horse from prototype
Animal speedy = registry.createHorse("Black");
speedy.makeSound();
```

### Expected Output

When you run the application, you'll see:

```
Creating a Sheep prototype.
Creating a Cow prototype.
Creating a Horse prototype.

Fluffy says: Baa!
Type: Sheep, Name: Fluffy

A Cow says: Moo!
Type: Cow

A Horse says: Neigh!
Type: Horse, Color: Black

Another Fluffy says: Baa!
```

## 🔧 Extending the Project

### Adding New Animal Types

To add a new animal type (e.g., `Dog`):

1. **Create** a new class implementing the `Animal` interface
2. **Add** the prototype to `AnimalRegistry`
3. **Implement** the required methods (`clone()`, `makeSound()`, `getType()`)

Example:
```java
public class Dog implements Animal {
    private int legs = 4;
    private String sound = "Woof!";
    private String food = "Dog Food";
    private String breed;
    
    public Dog(String breed) {
        this.breed = breed;
        System.out.println("Creating a Dog prototype.");
    }
    
    // Implementation details...
}
```

## 🎯 Design Patterns Used

### Prototype Pattern
- **Purpose**: Create new objects by cloning existing prototypes
- **Benefits**: Reduces initialization overhead and ensures consistency
- **Implementation**: Each animal class implements `Cloneable` and provides a `clone()` method

### Factory Pattern (Registry)
- **Purpose**: Centralized creation of animal instances
- **Benefits**: Encapsulates object creation logic and provides a clean API
- **Implementation**: `AnimalRegistry` manages prototypes and provides factory methods

## 🐾 Animal Characteristics

### Sheep
- **Sound**: "Baa!"
- **Food**: Grass
- **Special Property**: Name (customizable)
- **Legs**: 4

### Cow
- **Sound**: "Moo!"
- **Food**: Hay
- **Special Property**: None (standard cow)
- **Legs**: 4

### Horse
- **Sound**: "Neigh!"
- **Food**: Oats
- **Special Property**: Color (customizable)
- **Legs**: 4

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new animal types
- Improving documentation
- Enhancing the prototype pattern implementation
- Adding unit tests
- Adding more animal properties and behaviors

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and design patterns best practices. The Prototype pattern is particularly useful when object creation is expensive, when you want to avoid building a class hierarchy of factories, or when instances of a class can have only a few different combinations of state.
