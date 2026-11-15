import java.util.Scanner;

/**
 * Assignment 2: Grade Evaluation Program
 * 
 * Description:
 * A Java program that takes student marks (or multiple subjects),
 * calculates the percentage, and determines the final grade (A, B, C, Fail)
 * using conditional statements (if-else).
 */
public class GradeEvaluator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("       WEEK 1 - GRADE EVALUATOR          ");
        System.out.println("=========================================");

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjectCount = scanner.nextInt();

        if (subjectCount <= 0) {
            System.out.println("Error: Number of subjects must be greater than 0.");
            scanner.close();
            return;
        }

        double totalMarks = 0;
        boolean hasInvalidMark = false;

        System.out.println("\nEnter marks for each subject (out of 100):");
        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Subject " + i + " marks: ");
            double marks = scanner.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered! Marks must be between 0 and 100.");
                hasInvalidMark = true;
                break;
            }
            totalMarks += marks;
        }

        if (!hasInvalidMark) {
            double percentage = totalMarks / subjectCount;
            String grade;
            String remarks;

            // Conditional logic for grade evaluation
            if (percentage >= 85) {
                grade = "A";
                remarks = "Excellent performance!";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Good job! Keep it up.";
            } else if (percentage >= 50) {
                grade = "C";
                remarks = "Satisfactory. Needs improvement.";
            } else {
                grade = "Fail";
                remarks = "Need to work harder and retake.";
            }

            System.out.println("\n-----------------------------------------");
            System.out.println("             REPORT CARD                 ");
            System.out.println("-----------------------------------------");
            System.out.println("Student Name : " + studentName);
            System.out.printf("Total Marks  : %.2f / %.2f\n", totalMarks, (subjectCount * 100.0));
            System.out.printf("Percentage   : %.2f%%\n", percentage);
            System.out.println("Final Grade  : " + grade);
            System.out.println("Remarks      : " + remarks);
            System.out.println("-----------------------------------------");
        }

        scanner.close();
    }
}
