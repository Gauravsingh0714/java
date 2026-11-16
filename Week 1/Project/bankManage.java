import java.util.Scanner;

public class bankManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited: " + depositAmount);
                        System.out.println("Current Balance: " + balance);
                    } else {
                        System.out.println("Error: Deposit amount must be positive.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Error: Withdraw amount must be positive.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdraw: " + withdrawAmount);
                        System.out.println("Remainig balance:" + balance);
                    }
                    break;
                case 3:
                    System.out.println("Your available balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using our Banking App.");
                    break;

                default:
                    System.out.println("Invalid selection! Please enter a number between 1 and 4.");
                    break;
            }
        }
        sc.close();
    }
}