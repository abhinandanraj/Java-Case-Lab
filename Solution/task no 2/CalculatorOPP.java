import java.util.Scanner;

// Abstract class for operations
abstract class Operation {
    protected double operand1;
    protected double operand2;

    public Operation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public abstract double calculate();
}

// Specific operation classes
class Addition extends Operation {
    public Addition(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        return operand1 + operand2;
    }
}

class Subtraction extends Operation {
    public Subtraction(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        return operand1 - operand2;
    }
}

class Multiplication extends Operation {
    public Multiplication(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        return operand1 * operand2;
    }
}

class Division extends Operation {
    public Division(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        if (operand2 == 0) {
            System.out.println("Error - division by zero.");
            return Double.NaN;
        }
        return operand1 / operand2;
    }
}

class Power extends Operation {
    public Power(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        return Math.pow(operand1, operand2);
    }
}

class Modulus extends Operation {
    public Modulus(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        return operand1 % operand2;
    }
}

// Calculator class to manage operations
class Calculator {
    public double compute(Operation operation) {
        return operation.calculate();
    }
}

// Main class with the console interface
public class CalculatorOPP{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Supported operations: + (add), - (subtract), * (multiply), / (divide), % (modulus), ^ (power)");
        System.out.println("Enter 'exit' to quit.");

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %, ^): ");
            String operator = scanner.next();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            Operation operation;
            switch (operator) {
                case "+":
                    operation = new Addition(num1, num2);
                    break;
                case "-":
                    operation = new Subtraction(num1, num2);
                    break;
                case "*":
                    operation = new Multiplication(num1, num2);
                    break;
                case "/":
                    operation = new Division(num1, num2);
                    break;
                case "%":
                    operation = new Modulus(num1, num2);
                    break;
                case "^":
                    operation = new Power(num1, num2);
                    break;
                default:
                    System.out.println("Unsupported operation. Try again.");
                    continue;
            }

            double result = calculator.compute(operation);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }

            System.out.print("Type 'exit' to quit or press Enter to continue: ");
            scanner.nextLine(); // consume newline
            String exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }
        }

        scanner.close();
    }
}
