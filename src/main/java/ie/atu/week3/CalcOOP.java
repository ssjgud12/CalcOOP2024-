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

        System.out.println("Please enter an operator (add or subtract): ");
        String op = sc.next();



        // Switch statement to determine operation
        switch (op) {
            case "add":
                add(a, b);
                break;
            case "subtract":
                subtract(a, b);
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
}

