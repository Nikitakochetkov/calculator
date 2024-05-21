package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        char operator;

        try {
            System.out.println("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.println("Enter second number: ");
            num2 = scanner.nextDouble();

            if (!ErrorHandling.isValidOperator(operator)) {
                ErrorHandling.handleInvalidOperator();
                return;
            }

            if (ErrorHandling.isDivisionByZero(num2, operator)) {
                ErrorHandling.handleDivisionByZero();
                return;
            }

            double result = performOperation(num1, num2, operator);
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            ErrorHandling.handleNonNumericInput();
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double performOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                ErrorHandling.handleInvalidOperator();
                return Double.NaN; // Not a Number
        }
    }
}