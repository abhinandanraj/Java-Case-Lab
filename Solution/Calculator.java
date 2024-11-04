import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error - division by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static double power(double a, double b) { return Math.pow(a, b); }
    public static double modulus(double a, double b) { return a % b; }

    public static void main(String[] args) {
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

            double result = 0;

            switch (operator) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    result = divide(num1, num2);
                    break;
                case "%":
                    result = modulus(num1, num2);
                    break;
                case "^":
                    result = power(num1, num2);
                    break;
                default:
                    System.out.println("Unsupported operation. Try again.");
                    continue;
            }

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
