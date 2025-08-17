# Game Character Combat System

A Java implementation of the **Strategy Design Pattern** for flexible character combat systems in games. This project demonstrates how to use strategy objects to define different attack and defense behaviors for game characters, making the combat system extensible and maintainable.

## 📋 Overview

The Game Character Combat Strategies system allows you to create different types of characters (Knight, Wizard, and Archer) with distinct combat behaviors. Instead of using conditional statements to determine attack and defense actions, the system uses strategy objects that can be easily swapped and extended. This approach makes the code more flexible, maintainable, and follows the Open/Closed Principle.

## 🏗️ Architecture

This project implements the **Strategy Design Pattern** with the following components:

- **Character Class**: The context class that uses attack and defense strategies
- **AttackStrategy Interface**: Defines the contract for all attack behaviors
- **DefenseStrategy Interface**: Defines the contract for all defense behaviors
- **Concrete Strategy Classes**: Specific implementations for each character type
- **GameApp**: Demonstrates the strategy pattern in action

### Design Pattern Benefits

- **Flexibility**: Easy to swap attack and defense strategies at runtime
- **Extensibility**: New character types can be added without modifying existing code
- **Maintainability**: Each strategy is encapsulated in its own class
- **Testability**: Strategies can be tested independently
- **Single Responsibility**: Each class has a single, well-defined purpose

## 📊 UML Class Diagram

The following diagram illustrates:
- The architecture of the Game Character Combat Strategies system
- Relationships between the core components:
  - The `Character` context class
  - Strategy interfaces: `AttackStrategy` and `DefenseStrategy`
  - Concrete strategy implementations for each character type
  - The main application class `GameApp`
- How the Strategy design pattern is applied in this project

## 🚀 Features

- **Multiple Character Types**: Support for Knight, Wizard, and Archer characters
- **Flexible Combat System**: Attack and defense strategies can be easily swapped
- **Extensible Design**: Easy to add new character types and combat strategies
- **Clean Architecture**: Well-structured, maintainable code following SOLID principles
- **Runtime Strategy Switching**: Characters can change their combat strategies dynamically

## 📁 Project Structure

```
game-character-combat-system/
├── src/
│   ├── Character.java                 # Character context class
│   ├── AttackStrategy.java            # Attack strategy interface
│   ├── DefenseStrategy.java           # Defense strategy interface
│   ├── KnightAttack.java              # Knight attack implementation
│   ├── KnightDefense.java             # Knight defense implementation
│   ├── WizardAttack.java              # Wizard attack implementation
│   ├── WizardDefense.java             # Wizard defense implementation
│   ├── ArcherAttack.java              # Archer attack implementation
│   ├── ArcherDefense.java             # Archer defense implementation
│   └── GameApp.java                   # Main application demo
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
   java -cp src GameApp
   ```

## 📖 Usage

### Basic Usage

The main application (`GameApp.java`) demonstrates how to use the strategy pattern:

```java
// Create a Knight character with specific attack and defense strategies
Character knight = new Character(new KnightAttack(), new KnightDefense());
knight.attack();  // Uses KnightAttack strategy
knight.defend();  // Uses KnightDefense strategy

// Create a Wizard character with different strategies
Character wizard = new Character(new WizardAttack(), new WizardDefense());
wizard.attack();  // Uses WizardAttack strategy
wizard.defend();  // Uses WizardDefense strategy

// Create an Archer character with unique strategies
Character archer = new Character(new ArcherAttack(), new ArcherDefense());
archer.attack();  // Uses ArcherAttack strategy
archer.defend();  // Uses ArcherDefense strategy
```

### Expected Output

When you run the application, you'll see:

```
Knight:
Knight attacks with a sword!
Using a shield to defend!
Dodging to avoid attack!
Creating a magic barrier for defense!

Wizard:
Wizard casts a spell!
Creating a magic barrier for defense!

Archer:
Archer shoots an arrow!
Dodging to avoid attack!
```

## 🔧 Extending the Project

### Adding New Character Types

To add a new character type (e.g., `Mage`):

1. **Create** new attack and defense strategy classes:
   ```java
   public class MageAttack implements AttackStrategy {
       public void attack() {
           System.out.println("Mage casts a powerful spell!");
       }
   }
   
   public class MageDefense implements DefenseStrategy {
       public void defend() {
           System.out.println("Mage creates a powerful magic shield!");
       }
   }
   ```

2. **Use** the new strategies in your application:
   ```java
   Character mage = new Character(new MageAttack(), new MageDefense());
   mage.attack();
   mage.defend();
   ```

### Adding New Combat Strategies

You can also create new strategy implementations for existing character types:

```java
public class BerserkerAttack implements AttackStrategy {
    public void attack() {
        System.out.println("Berserker goes into a rage and attacks wildly!");
    }
}

// Use with any character
Character berserkerKnight = new Character(new BerserkerAttack(), new KnightDefense());
```

## 🎯 Design Patterns Used

### Strategy Pattern
- **Purpose**: Define a family of algorithms, encapsulate each one, and make them interchangeable
- **Benefits**: Allows algorithms to vary independently from clients that use them
- **Implementation**: 
  - `AttackStrategy` and `DefenseStrategy` interfaces define the algorithm contracts
  - Concrete strategy classes implement specific behaviors
  - `Character` class uses composition to delegate to strategy objects

### Composition over Inheritance
- **Purpose**: Favor object composition over class inheritance
- **Benefits**: More flexible and avoids the limitations of inheritance
- **Implementation**: `Character` class composes `AttackStrategy` and `DefenseStrategy` objects

## 🎮 Character Types and Behaviors

### Knight
- **Attack**: Uses a sword for close combat
- **Defense**: Multiple strategies - shield, dodge, and magic barrier
- **Role**: Tank/Melee fighter

### Wizard
- **Attack**: Casts powerful spells
- **Defense**: Creates magic barriers for protection
- **Role**: Magic damage dealer

### Archer
- **Attack**: Shoots arrows from a distance
- **Defense**: Uses dodge to avoid incoming attacks
- **Role**: Ranged damage dealer

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new character types with unique combat strategies
- Implementing more complex combat mechanics
- Adding unit tests for strategy classes
- Improving documentation and examples
- Creating additional strategy variations

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and design patterns best practices. The Strategy pattern is particularly useful when you have a family of related algorithms and want to make them interchangeable, or when you want to avoid multiple conditional statements in your code.
