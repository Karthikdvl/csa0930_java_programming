import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        boolean isValid = isValidUsername(username);
        
        if (isValid) {
            System.out.println("The entered username '" + username + "' is valid.");
        } else {
            System.out.println("The entered username '" + username + "' is not valid.");
        }
    }
    
    public static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 20) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == '_' || ch == '-')) {
                return false;
            }
        }
        return true;
    }
}