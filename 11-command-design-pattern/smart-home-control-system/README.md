# Smart Home Automation

A Java implementation of the **Command Design Pattern** for smart home device control and automation. This project demonstrates how to create a flexible and extensible system for controlling various smart home devices through a unified command interface.

## 📋 Overview

The Smart Home Automation system provides a centralized control mechanism for managing multiple smart home devices including lights, music systems, and thermostats. Using the Command pattern, the system encapsulates device operations as objects, allowing for easy device control, command queuing, and system extensibility without modifying existing code.

## 🏗️ Architecture

This project implements the **Command Design Pattern** with the following components:

- **Command Interface**: Defines the contract for all device commands
- **Concrete Commands**: Specific command implementations (TurnOn, TurnOff, IncreaseSetting, etc.)
- **Device Interface**: Common interface for all smart home devices
- **Concrete Devices**: LightSystem, MusicSystem, and Thermostat implementations
- **Control Class**: The invoker that executes commands
- **CentralHub**: Main application providing user interface

### Design Pattern Benefits

- **Decoupling**: Separates command execution from device implementation
- **Extensibility**: Easy to add new devices and commands without modifying existing code
- **Flexibility**: Commands can be queued, logged, or undone
- **Maintainability**: Clean separation of concerns between command logic and device logic

## 📊 UML Class Diagram
<img width="1940" height="1416" alt="UML Class Diagram" src="https://github.com/user-attachments/assets/8f39363b-e7d9-4825-a848-b8d352c53089" />

The following diagram illustrates:
- The architecture of the Smart Home Automation system
- Relationships between the core components:
  - The `Command` interface and its concrete implementations
  - The `Device` interface and concrete device classes
  - The `Control` class as the command invoker
  - The `CentralHub` as the main application
- How the Command design pattern is applied in this project

## 🚀 Features

- **Multiple Device Types**: Support for lights, music systems, and thermostats
- **Unified Control Interface**: Single control mechanism for all devices
- **Extensible Design**: Easy to add new devices and commands
- **Interactive Menu System**: User-friendly console interface
- **Clean Architecture**: Well-structured, maintainable code following design patterns

## 📁 Project Structure

```
smart-home-control-system/
├── src/
│   ├── Command.java                   # Command interface
│   ├── TurnOn.java                    # Turn on command implementation
│   ├── TurnOff.java                   # Turn off command implementation
│   ├── IncreaseSetting.java           # Increase setting command
│   ├── DecreaseSetting.java           # Decrease setting command
│   ├── ChangePlaylist.java            # Change playlist command
│   ├── Device.java                    # Device interface
│   ├── LightSystem.java               # Light device implementation
│   ├── MusicSystem.java               # Music system implementation
│   ├── Thermostat.java                # Thermostat device implementation
│   ├── Control.java                   # Command invoker
│   └── CentralHub.java                # Main application
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
   java -cp src CentralHub
   ```

## 📖 Usage

### Interactive Menu System

The main application (`CentralHub.java`) provides an interactive menu system:

```
MAIN MENU:
1. Control Light
2. Control Music
3. Control Thermostat
4. Exit

Select a device to control: 1

LIGHT CONTROLS:
1. Turn On
2. Turn Off
3. Increase Brightness
4. Decrease Brightness

Select an action: 1
Light is turned on!
```

### Device Control Examples

Each device type has specific controls:

**Light System:**
- Turn On/Off
- Increase/Decrease Brightness

**Music System:**
- Turn On/Off
- Increase/Decrease Volume
- Change Playlist

**Thermostat:**
- Turn On/Off
- Increase/Decrease Temperature

### Expected Output

When you run the application, you'll see:

```
MAIN MENU:
1. Control Light
2. Control Music
3. Control Thermostat
4. Exit

Select a device to control: 1

LIGHT CONTROLS:
1. Turn On
2. Turn Off
3. Increase Brightness
4. Decrease Brightness

Select an action: 1
Light is turned on!
```

## 🔧 Extending the Project

### Adding New Devices

To add a new device type (e.g., `SecurityCamera`):

1. **Create** a new class implementing the `Device` interface
2. **Implement** the required methods (`turnOn()`, `turnOff()`, `increaseSetting()`, `decreaseSetting()`)
3. **Add** device controls to the `CentralHub` menu system

Example:
```java
public class SecurityCamera implements Device {
    @Override
    public void turnOn() {
        System.out.println("Security camera activated!");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Security camera deactivated!");
    }
    
    @Override
    public void increaseSetting() {
        System.out.println("Increasing camera sensitivity...");
    }
    
    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing camera sensitivity...");
    }
}
```

### Adding New Commands

To add a new command (e.g., `EmergencyMode`):

1. **Create** a new class implementing the `Command` interface
2. **Implement** the `execute()` method
3. **Add** the command to the appropriate device menu

Example:
```java
public class EmergencyMode implements Command {
    private Device device;
    
    public EmergencyMode(Device device) {
        this.device = device;
    }
    
    @Override
    public void execute() {
        System.out.println("Emergency mode activated!");
        // Device-specific emergency logic
    }
}
```

## 🎯 Design Patterns Used

### Command Pattern
- **Purpose**: Encapsulate a request as an object, allowing parameterization of clients with different requests
- **Benefits**: Decouples command execution from device implementation, enables command queuing and logging
- **Implementation**: Each command implements the `Command` interface with an `execute()` method

### Strategy Pattern (Implicit)
- **Purpose**: Different devices implement the same interface with different behaviors
- **Benefits**: Allows runtime selection of device behavior
- **Implementation**: All devices implement the `Device` interface

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new smart home devices
- Implementing additional commands
- Improving the user interface
- Adding unit tests
- Enhancing documentation

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates the Command design pattern's effectiveness in creating flexible, extensible systems. The Command pattern is particularly useful in scenarios where you need to parameterize objects with operations, queue operations, or support undoable operations.
