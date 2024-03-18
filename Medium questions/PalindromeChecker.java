import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check if a string is a palindrome");
        System.out.println("2. Check if a number is a palindrome");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                String inputString = scanner.next();
                if (isPalindrome(inputString)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a palindrome");
                }
                break;
            case 2:
                System.out.print("Enter a number: ");
                int inputNumber = scanner.nextInt();
                if (isPalindrome(inputNumber)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a palindrome");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}
