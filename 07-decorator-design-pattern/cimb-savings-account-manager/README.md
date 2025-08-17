# CIMB Digital Banking: Savings Account Enhancement

A Java implementation of the **Decorator Design Pattern** for flexible savings account features. This project demonstrates how to extend a base `SavingsAccount` with additional capabilities (e.g., higher interest, extra benefits) by wrapping it with decorators (`GSave`, `UpSave`).

## 📋 Overview

Decorate a base savings account without modifying its code. Apply `GSave` or `UpSave` to alter the account type, interest rate, and benefits while preserving the original account state and behavior via composition.

## 🏗️ Architecture

This project implements the Decorator Design Pattern with the following components:

- **BankAccount interface**: Defines the contract shared by the base and all decorators
- **SavingsAccount (Concrete Component)**: Base implementation
- **BankAccountDecorator interface**: Decorator type that extends `BankAccount`
- **GSave / UpSave (Concrete Decorators)**: Wrap a `BankAccount` and augment behavior
- **CIMB (Main Application)**: Demonstrates the decorators in action

### Design Pattern Benefits

- **Open/Closed**: Extend behavior via new decorators without changing existing code
- **Composition over inheritance**: Combine features at runtime
- **Single Responsibility**: Keep the base class simple; put extras in decorators
- **Extensibility**: Easy to add new account variants

## 📊 UML Class Diagram
<img width="1293" height="807" alt="UML Class Diagram" src="https://github.com/user-attachments/assets/32fef137-db4b-4663-bec2-0717a7206416" />

The following diagram illustrates:

- The architecture of the CIMB Savings Account Manager
- Relationships between the core components:
   - The `BankAccount` component interface
   - `SavingsAccount` as the concrete component
   - `BankAccountDecorator` as the decorator interface
   - Concrete decorators: `GSave`, `UpSave`
   - How each decorator wraps a `BankAccount` and overrides select behavior
- How the Decorator design pattern is applied in this project

## 🚀 Features

- **Multiple account types**: Savings Account, GSave, UpSave
- **Decorator-based extensions**: Add benefits and adjust interest by wrapping
- **Type-safe interface**: Unified `BankAccount` API across all implementations
- **Clean architecture**: Small, focused classes following SOLID principles

## 📁 Project Structure

```
cimb-savings-account-manager/
├── src/
│   ├── BankAccount.java               # Component interface
│   ├── BankAccountDecorator.java      # Decorator interface (extends BankAccount)
│   ├── SavingsAccount.java            # Concrete component (base account)
│   ├── GSave.java                     # Concrete decorator (GCash transfer, 2.5%)
│   ├── UpSave.java                    # Concrete decorator (with insurance, 4.0%)
│   └── CIMB.java                      # Main application demo
└── README.md						   # Project documentation
```

## 🛠️ Installation & Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or a terminal with `javac`/`java`

### Getting Started

1. Clone or download the project
2. Open a terminal in the project root directory
3. Compile the sources, outputting classes to `out/`:
   - Windows (PowerShell):
     ```powershell
     javac -d out src/*.java
     ```
   - macOS/Linux (bash):
     ```bash
     javac -d out src/*.java
     ```
4. Run the demo application:
   - Windows (PowerShell):
     ```powershell
     java -cp out DecoratorPattern.CIMB
     ```
   - macOS/Linux (bash):
     ```bash
     java -cp out DecoratorPattern.CIMB
     ```

## 📖 Usage

Basic usage is demonstrated in `src/CIMB.java`:

```java
package DecoratorPattern;

public class CIMB {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.setAccountNumber(1234);
        account.setAccountName("Juan Dela Cruz");
        account.setBalance(10000.0);

        System.out.println(account.showInfo());
        System.out.println("Account type: " + account.showAccountType());
        System.out.println("Interest rate: " + account.getInterestRate());
        System.out.println("New balance: " + account.computeBalanceWithInterest());
        System.out.println("Benefits: " + account.showBenefits());

        System.out.println("-------------------------------------------------------------");

        GSave gSave = new GSave(account);
        System.out.println(gSave.showInfo());
        System.out.println("Account type: " + gSave.showAccountType());
        System.out.println("Interest rate: " + gSave.getInterestRate());
        System.out.println("New balance: " + gSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + gSave.showBenefits());

        System.out.println("-------------------------------------------------------------");

        UpSave upSave = new UpSave(account);
        System.out.println(upSave.showInfo());
        System.out.println("Account type: " + upSave.showAccountType());
        System.out.println("Interest rate: " + upSave.getInterestRate());
        System.out.println("New balance: " + upSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + upSave.showBenefits());
    }
}
```

### Expected Output

```
Account number: 1234
Account name: Juan Dela Cruz
Balance: 10000.0
Account type: Savings Account
Interest rate: 0.01
New balance: 10100.0
Benefits: Standard Savings Account
-------------------------------------------------------------
Account number: 1234
Account name: Juan Dela Cruz
Balance: 10000.0
Account type: GSave
Interest rate: 0.025
New balance: 10250.0
Benefits: Standard Savings Account, GCash Transfer
-------------------------------------------------------------
Account number: 1234
Account name: Juan Dela Cruz
Balance: 10000.0
Account type: UpSave
Interest rate: 0.04
New balance: 10400.0
Benefits: Standard Savings Account, With Insurance
```

## 🔧 Extending the Project

### Adding a New Decorator (e.g., `ProSave`)

1. Create a class that implements `BankAccountDecorator` and wraps a `BankAccount`.
2. Override the necessary methods to change the account type, interest, and benefits.
3. Use your decorator by wrapping an existing `BankAccount` instance.

Example skeleton:

```java
package DecoratorPattern;

public class ProSave implements BankAccountDecorator {
    private final BankAccount bankAccount;

    public ProSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() { return "ProSave"; }

    @Override
    public double getInterestRate() { return 0.03; }

    @Override
    public double getBalance() { return bankAccount.getBalance(); }

    @Override
    public String showBenefits() { return bankAccount.showBenefits() + ", Priority Support"; }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() + bankAccount.getBalance() * getInterestRate();
    }

    @Override
    public String showInfo() { return bankAccount.showInfo(); }

    @Override
    public void setBankAccount() { /* optional */ }
}
```

## 🎯 Design Patterns Used

### Decorator Pattern
- **Purpose**: Add responsibilities to objects dynamically without changing their class
- **Benefits**: Extends behavior transparently; promotes composition over inheritance
- **Implementation**: Decorators implement `BankAccount` and hold a reference to another `BankAccount` instance, delegating and augmenting behavior

## 🤝 Contributing

Contributions are welcome! You can:
- Add new decorators (account variants)
- Improve documentation
- Add tests or examples

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and design patterns best practices. The Decorator pattern is particularly useful when you want to add responsibilities to objects dynamically without changing their class, when you need to combine multiple behaviors at runtime, or when you want to avoid creating a large number of subclasses for every possible combination of features.
