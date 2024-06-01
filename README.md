# Calcy - Personal Calculator

Calcy is a simple and intuitive calculator application built using Java. This project showcases the implementation of a basic calculator with a graphical user interface (GUI) that allows users to perform arithmetic operations such as addition, subtraction, multiplication, and division.

## Features ✨

- **Simple GUI**: Easy-to-use interface with buttons for digits and arithmetic operations.
- **Basic Arithmetic Operations**: Supports addition, subtraction, multiplication, and division.
- **Clear Function**: Ability to clear the input field.
- **Keyboard Input Support**: Allows users to use the keyboard for input and operations.

## Prerequisites 📋

- Java Development Kit (JDK) installed
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor
- Basic understanding of Java programming

## Installation and Setup 🚀

### Steps 🛠️

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/Mustafabharmal/Calculator-Java.git
    cd Calculator-Java
    ```

2. **Compile the Java Files**:
    Open a terminal in the project directory and run the following command to compile the Java files:
    ```bash
    javac CalcView.java
    ```

3. **Run the Application**:
    After successful compilation, run the application using:
    ```bash
    java CalcView
    ```

## Project Structure 📁

- **CalcController.java**: Handles the business logic and user interactions.
- **CalcView.java**: Defines the GUI layout and initializes the components.

## Usage Instructions 📝

### Graphical User Interface 🖥️

1. **Start the Calculator**:
   - Run the `CalcView` class to launch the calculator GUI.
   
2. **Perform Calculations**:
   - Click on the digit buttons to enter numbers.
   - Use the arithmetic operation buttons (`+`, `-`, `x`, `/`) to perform calculations.
   - Press the `=` button to display the result.
   - Use the `CLS` button to clear the input field.

3. **Keyboard Input**:
   - You can also use the keyboard to input numbers and operations.
   - Press `Enter` to display the result.

## Code Overview 🔍

### CalcController.java

The `CalcController` class implements `ActionListener` and `KeyListener` interfaces to handle button clicks and keyboard inputs. It performs the arithmetic operations and updates the display accordingly.

### CalcView.java

The `CalcView` class extends `Frame` and sets up the GUI components, including buttons and text fields. It initializes the controller and sets up the layout and event listeners.

## Conclusion 🎉

Calcy provides a simple and interactive way to perform basic arithmetic operations using a graphical calculator interface. It demonstrates the use of Java for creating GUI applications and handling user interactions through event listeners.

**Happy Calculating!** 💻🚀
