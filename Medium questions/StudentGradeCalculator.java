import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks for Python programming : ");
        double pythonMarks = scanner.nextDouble();

        System.out.print("Enter the marks in C Programming: ");
        double cProgrammingMarks = scanner.nextDouble();

        System.out.print("Enter the marks in Mathematics: ");
        double mathMarks = scanner.nextDouble();

        System.out.print("Enter the marks in Physics: ");
        double physicsMarks = scanner.nextDouble();

        // Calculate total marks
        double totalMarks = pythonMarks + cProgrammingMarks + mathMarks + physicsMarks;
        // Calculate aggregate
        double aggregate = totalMarks / 4.0;

        System.out.println("Total = " + totalMarks);
        System.out.println("Aggregate = " + aggregate);

        // Determine the grade based on aggregate
        String grade;
        if (aggregate > 75) {
            grade = "Distinction";
        } else if (aggregate >= 60) {
            grade = "First Division";
        } else if (aggregate >= 50) {
            grade = "Second Division";
        } else if (aggregate >= 40) {
            grade = "Third Division";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);
    }
}
