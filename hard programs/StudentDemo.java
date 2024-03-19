import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AgeNotWithinRangeException extends Exception {
    @Override
    public String toString() {
        return "Age is not within the valid range (15 to 21). Please re-enter the age.";
    }
}

class NameNotValidException extends Exception {
    @Override
    public String toString() {
        return "Name is not valid. Please re-enter a valid name.";
    }
}

class Student {
    private int roll;
    private String name;
    private int age;
    private String course;

    public Student(int roll, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.roll = roll;
        this.course = course;

        // Validate name (no numbers or special symbols)
        if (!isValidName(name)) {
            throw new NameNotValidException();
        } else {
            this.name = name;
        }

        // Validate age (within the range 15 to 21)
        if (age >= 15 && age <= 21) {
            this.age = age;
        } else {
            throw new AgeNotWithinRangeException();
        }
    }

    private boolean isValidName(String name) {
        // Check if the name contains only alphabetic characters
        return name.matches("[a-zA-Z]+");
    }

    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter roll number: ");
            int roll = Integer.parseInt(br.readLine());

            System.out.print("Enter name: ");
            String name = br.readLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter course: ");
            String course = br.readLine();

            Student student = new Student(roll, name, age, course);
            student.display();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e);
        }
    }
}
