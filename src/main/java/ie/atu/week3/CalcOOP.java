package ie.atu.week3;

import java.util.Scanner;

public class CalcOOP {

    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Please enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Please enter an operator (add, subtract, multiply, divide, or exponent): ");
        String op = sc.next();



        // Switch statement to determine operation
        switch (op) {
            case "add":
                add(a, b);
                break;
            case "subtract":
                subtract(a, b);
                break;
            case "multiply":
                multiply(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
            case "exponent":
                exponent(a, b);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

    // Method to perform addition
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    // Method to perform subtraction
    public static void subtract(int a, int b) {
        int sum = a - b;
        System.out.println("The sum is: " + sum);
    }

    // Method to perform multiplication
    public static void multiply(int a, int b) {
        int sum = a * b;
        System.out.println("The sum is: " + sum);
    }

    // Method to perform division
    public static void divide(int a, int b) {
        if (b != 0) {
            int sum = a / b;
            System.out.println("The sum is: " + sum);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Method to perform exponentiation (a raised to the power of b)
    public static void exponent(int a, int b) {
        double sum = Math.pow(a, b);
        System.out.println("The sum is: " + sum);
    }
}

