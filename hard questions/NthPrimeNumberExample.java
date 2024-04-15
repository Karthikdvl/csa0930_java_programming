import java.util.Scanner;

public class NthPrimeNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: ");
        int n = sc.nextInt();

        int num = 1; // Initialize the first prime number (2 is the only even prime number)
        int count = 0; // Count of discovered prime numbers
        int i;

        while (count < n) {
            num++; // Move to the next number
            for (i = 2; i <= num; i++) {
                // Check if num is divisible by any number from 2 to num-1
                if (num % i == 0) {
                    break; // Not a prime number, break the loop
                }
            }
            if (i == num) {
                // If the loop completed without finding a divisor, num is prime
                count++; // Increment the count of prime numbers
            }
        }

        System.out.println("The " + n + "th prime number is: " + num);

        // Print the next n prime numbers after the nth prime number
        int nextCount = 0;
        int nextNum = num + 1; // Start checking from the next number
        while (nextCount < n) {
            nextNum++;
            for (i = 2; i <= nextNum; i++) {
                if (nextNum % i == 0) {
                    break;
                }
            }
            if (i == nextNum) {
                nextCount++;
                System.out.print(nextNum);
                if (nextCount < n) {
                    System.out.print(", "); // Print a comma if there are more prime numbers
                }
            }
        }
        System.out.println(); // Print a newline
    }
}
