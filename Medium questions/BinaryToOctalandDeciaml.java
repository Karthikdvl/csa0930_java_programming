import java.util.Scanner;

public class BinaryToOctalandDeciaml {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.next();

        // Convert binary to decimal
        int decimal = Integer.parseInt(binaryStr, 2);

        // Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        System.out.println("Decimal Number: " + decimal);

        System.out.println("Octal: " + octal);

    }
}
