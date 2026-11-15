import java.util.Scanner;

/**
 * Assignment 1: Basic Calculator Program
 * 
 * Description:
 * A menu-driven Java console program that performs basic arithmetic operations
 * (Addition, Subtraction, Multiplication, Division) based on user input.
 */
public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("=========================================");
        System.out.println("        WEEK 1 - BASIC CALCULATOR        ");
        System.out.println("=========================================");

        while (continueCalculating) {
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is undefined.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator! Please use +, -, *, or /.");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.printf("Result: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice != 'y') {
                continueCalculating = false;
                System.out.println("\nThank you for using Basic Calculator. Goodbye!");
            }
        }

        scanner.close();
    }
}
