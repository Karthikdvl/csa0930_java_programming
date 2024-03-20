public class PrimeNumberCounter15 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19}; // Example array (you can modify this)

        int primeCount = 0; // Initialize the counter for prime numbers

        for (int number : numbers) {
            if (isPrime(number)) {
                primeCount++;
            }
        }

        System.out.println("Number of prime numbers in the array: " + primeCount);
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
