import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");

        int decimal = sc.nextInt();

        if (decimal < 0) {
        System.out.println("Invalid input. Please enter a positive integer.");
        } else {

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal /= 2;
        }

        StringBuilder reverse = new StringBuilder();
        for (int i = binary.length() - 1; i >= 0; i--) {
            reverse.append(binary.charAt(i));
        }

        int reverseDecimal = 0;
        int power = 1;
        for (int i = 0; i < reverse.length(); i++) {
            reverseDecimal += (reverse.charAt(i) - '0') * power;
            power *= 2;
        }

        System.out.println("The reverse of the binary decimal is: " + reverseDecimal);
        }

        sc.close();
    }
}
