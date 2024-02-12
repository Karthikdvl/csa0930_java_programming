import java.util.Scanner;
import java.lang.*;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String stringInput = sc.nextLine();
        int outputInteger = stringToInteger(stringInput);

        
        System.out.println("Output integer: " + outputInteger);
    }

    public static int stringToInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Cannot convert to integer.");
            return -1; 
        }
    }
}
