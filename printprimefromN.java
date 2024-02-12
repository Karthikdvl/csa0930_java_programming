import java.util.Scanner;

public class printprimefromN{
public static boolean isPrime(int n) {
    // 0 and 1 are not prime
    if (n < 2) {
      return false;
    }
    // 2 is the only even prime
    if (n == 2) {
      return true;
    }
    // Check for divisibility by 2 or any odd number up to the square root of n
    if (n % 2 == 0) {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    // If no divisor is found
    return true;
  }
  
  // A function to print n prime numbers after the nth prime number
  public static void printPrimes(int n) {
    // Initialize the count of primes and the current number to check
    int count = 0;
    int num = 2;
    // Find the nth prime number
    while (count < n) {
      if (isPrime(num)) {
        count++;
      }
      num++;
    }
    // Reset the count and print n more primes
    count = 0;
    System.out.println("The next " + n + " prime numbers after the " + n + "th prime are:");
    while (count < n) {
      if (isPrime(num)) {
        System.out.print(num + " ");
        count++;
      }
      num++;
    }
    System.out.println();
  }
  
  // A main function to take input from the user and call the printPrimes function
  public static void main(String[] args) {
    // Create a scanner object to read input
    Scanner sc = new Scanner(System.in);
    // Prompt the user to enter a positive integer
    System.out.println("Enter a positive integer:");
    // Read the input and validate it
    int n = sc.nextInt();
    if (n <= 0) {
      System.out.println("Invalid input. Please enter a positive integer.");
    } else {
      // Call the printPrimes function with the input
      printPrimes(n);
    }
    // Close the scanner object
    sc.close();
  }
}