import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Replace word "Saveetha" with "Awesome"
        String replacedString = inputString.replace("University", "College");
        System.out.println("Replaced string: " + replacedString);

        // Find the length of the string
        int stringLength = inputString.length();
        System.out.println("Length of the string: " + stringLength);

        // Convert the string to uppercase
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        scanner.close();
    }
}
