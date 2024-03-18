class PrimeChecker implements Runnable {
    private int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        }
    }

    private boolean isPrime(int num) {
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

public class primeThread {
    public static void main(String[] args) {
        int inputNumber = 5; // Sample input: 5

        // Create a thread to check if the number is prime
        Thread primeThread = new Thread(new PrimeChecker(inputNumber));
        primeThread.start();
    }
}
