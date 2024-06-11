package org.example;

public class ErrorHandling {

    public static boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }

    public static boolean isDivisionByZero(double b, char operator) {
        return operator == '/' && b == 0;
    }

    public static void handleNonNumericInput() {
        System.out.println("Error! Non-numeric input.");
    }

    public static void handleInvalidOperator() {
        System.out.println("Error! Invalid operator.");
    }

    public static void handleDivisionByZero() {
        System.out.println("Error! Division by zero.");
    }

    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
