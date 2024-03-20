import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading char input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Reading String input
        System.out.print("Enter a string: ");
        String str = scanner.next();

        // Reading int input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Reading float input
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        // Reading double input
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Printing the inputs
        System.out.println("Char: " + ch);
        System.out.println("String: " + str);
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        // Close the scanner
        scanner.close();
    }
}
