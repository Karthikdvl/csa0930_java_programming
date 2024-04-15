import java.util.Scanner;

public class ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        long inputNumber = sc.nextLong();

        long result = reverseAndAddToPalindrome(inputNumber);
        if (result == -1) {
            System.out.println("No palindrome exists for the given number.");
        } else {
            System.out.println("Palindrome obtained: " + result);
        }
    }

    // Function to reverse the digits of a number
    private static long reverseDigits(long num) {
        long reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(long num) {
        return reverseDigits(num) == num;
    }

    // Function to reverse and add until a palindrome is obtained
    private static long reverseAndAddToPalindrome(long num) {
        int iterations = 0;
        while (!isPalindrome(num)) {
            long reversed = reverseDigits(num);
            num += reversed;
            iterations++;
            if (iterations > 1000 || num > 4294967295L) {
                return -1; // No palindrome exists
            }
        }
        return num;
    }
}
