class FibonacciGenerator implements Runnable {
    private int n;

    public FibonacciGenerator(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}

public class FibonacciThreadDemo {
    public static void main(String[] args) {
        int n = 5; // Change this value to generate a different number of terms

        Thread fibonacciThread = new Thread(new FibonacciGenerator(n));
        fibonacciThread.start();
    }
}
