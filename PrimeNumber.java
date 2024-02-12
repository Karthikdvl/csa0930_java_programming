import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = sc.nextInt();

    sc.close();

    if (isPrime(number)) {
      System.out.println(number + " is a prime number.");
    } else {
      System.out.println(number + " is not a prime number.");
    }
  }

  public static boolean isPrime(int num) {
    
    if (num <= 1) {
      return false;
    }

    if (num == 2 || num == 3) {
      return true;
    }

    if (num % 2 == 0 || num % 3 == 0) {
      return false;
    }

    for (int i = 5; i <= Math.sqrt(num); i += 2) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}
