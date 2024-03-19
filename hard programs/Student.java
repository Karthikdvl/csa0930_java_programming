public class Student {
    private String name;
    private int registerNumber;
    private int[] subjectMarks;

    public Student(String name, int registerNumber, int[] subjectMarks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.subjectMarks = subjectMarks;
    }

    public double calculateAverage() {
        int totalMarks = 0;
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }
        return (double) totalMarks / subjectMarks.length;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Subject Marks: ");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println("Average Marks: " + calculateAverage());
    }

    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 85, 88}; // Example subject marks
        Student student = new Student("John", 12345, marks);
        student.displayDetails();
    }
}
