import java.util.Scanner;

public class gradeEvaluate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student marks (0 to 100): ");
        double marks = sc.nextDouble();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks must be between 0 and 100.");
        } else if (marks >= 85) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
        sc.close();
    }
}
