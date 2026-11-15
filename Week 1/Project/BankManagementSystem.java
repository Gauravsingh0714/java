import java.util.Scanner;

/**
 * Week 1 Mini Project: Bank Management Console Application (Basic Version)
 * 
 * Features:
 * - Interactive, menu-driven console interface
 * - Check current account balance
 * - Deposit funds with input validation
 * - Withdraw funds with balance verification
 * - View account details and mini summary
 * - Implemented using Java Scanner, Loops, and Conditional Logic
 */
public class BankManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("      WELCOME TO JAVA INTERNSHIP BANK APP        ");
        System.out.println("==================================================");

        // Account setup
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine().trim();

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine().trim();

        System.out.print("Enter Initial Deposit Amount (₹): ");
        double balance = scanner.nextDouble();

        while (balance < 0) {
            System.out.print("Initial balance cannot be negative. Re-enter initial deposit: ₹");
            balance = scanner.nextDouble();
        }

        System.out.println("\nAccount successfully initialized for " + accountHolder + "!");

        boolean running = true;

        while (running) {
            System.out.println("\n==================================================");
            System.out.println("                    MAIN MENU                     ");
            System.out.println("==================================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n>>> [CHECK BALANCE]");
                    System.out.printf("Current Available Balance: ₹%.2f\n", balance);
                    break;

                case 2:
                    System.out.println("\n>>> [DEPOSIT MONEY]");
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited ₹%.2f.\n", depositAmount);
                        System.out.printf("Updated Balance: ₹%.2f\n", balance);
                    } else {
                        System.out.println("Error: Deposit amount must be positive.");
                    }
                    break;

                case 3:
                    System.out.println("\n>>> [WITHDRAW MONEY]");
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Error: Withdrawal amount must be greater than zero.");
                    } else if (withdrawAmount > balance) {
                        System.out.printf("Error: Insufficient funds! You only have ₹%.2f available.\n", balance);
                    } else {
                        balance -= withdrawAmount;
                        System.out.printf("Successfully withdrawn ₹%.2f.\n", withdrawAmount);
                        System.out.printf("Updated Balance: ₹%.2f\n", balance);
                    }
                    break;

                case 4:
                    System.out.println("\n>>> [ACCOUNT SUMMARY]");
                    System.out.println("Account Holder : " + accountHolder);
                    System.out.println("Account Number : " + accountNumber);
                    System.out.printf("Current Balance: ₹%.2f\n", balance);
                    break;

                case 5:
                    running = false;
                    System.out.println("\nThank you for banking with us. Have a great day!");
                    break;

                default:
                    System.out.println("Error: Invalid selection. Please choose an option between 1 and 5.");
                    break;
            }
        }

        scanner.close();
    }
}
