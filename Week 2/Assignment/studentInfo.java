import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String course;
    double marks;

    Student(String name, int rollNumber, String course, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class studentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(name, rollNumber, course, marks);

        student.displayInfo();

        sc.close();
    }
}
