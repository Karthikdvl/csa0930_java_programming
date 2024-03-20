import java.util.Scanner;

public class LoopComparison13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get input values for Loop 1
        System.out.print("Enter the value for Loop 1: ");
        int loop1Value = scan.nextInt();

        // Get input values for Loop 2
        System.out.print("Enter the value for Loop 2: ");
        int loop2Value = scan.nextInt();

        // Compare the values using nested if statements
        if (loop1Value > loop2Value) {
            System.out.println("Loop 1 has the greater value.");
        } else if (loop2Value > loop1Value) {
            System.out.println("Loop 2 has the greater value.");
        } else {
            System.out.println("Both loops have the same value.");
        }
    }
}
