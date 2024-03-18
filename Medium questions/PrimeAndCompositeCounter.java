import java.util.Scanner;

public class PrimeAndCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();

        int primeCount = 0;
        int compositeCount = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (isPrime(num)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        System.out.println("Prime numbers: " + primeCount);
        System.out.println("Composite numbers: " + compositeCount);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
