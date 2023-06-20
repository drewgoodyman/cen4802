package com.example;

import java.util.Scanner;

/**
 * This calculator class provides basic mathematics functions.
 */
public class Calculator {
    /**
     * Adds two numbers
     * @param a The First Number
     * @param b The Second Number
     * @return The sum of the two numbers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtrackts two numbers.
     * @param a The number that is subtracted from.
     * @param b The number to subtract.
     * @return The differences tween the two numbers.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a The first number.
     * @param b The second number.
     * @return The product of the two numbers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one number by another number.
     * @param a The Dividend.
     * @param b The divisor.
     * @return The divison result as a double.
     * @throws IllegalArgumentException if the divisor is a zero.
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division By Zero Is Not Allowed.");
        }
        return (double) a / b;
    }

    /**
     * Calculates the square of a number
     * @param a The number to be squared
     * @return The square of the number.
     */
    public int square(int a) {
        return a * a;
    }

    /**
     * Calculates the power of a number raised to an exponential number.
     * @param base The base number
     * @param exponent The exponent
     * @return The result of raising the base to the power of the exponent
     * @throws IllegalArgumentException If the exponent is a negative number.
     */
    public int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent Must Be A Non-Negative Number.");
        }
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    /**
     * The main method that allows the calculator to be used interactively
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("The Basic Calculator!");

        while (true) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Power");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            double result = 0;
            boolean exit = false;

            switch (choice) {
                case 1 -> result = calculator.add(num1, num2);
                case 2 -> result = calculator.subtract(num1, num2);
                case 3 -> result = calculator.multiply(num1, num2);
                case 4 -> result = calculator.divide(num1, num2);
                case 5 -> result = calculator.square(num1);
                case 6 -> result = calculator.power(num1, num2);
                case 0 -> exit = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }

            if (!exit) {
                System.out.println("Result: " + result);
                System.out.println();
            } else {
                System.out.println("Exiting the Calculator. Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
