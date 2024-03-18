class NumberPrinter implements Runnable {
    private int start;
    private int max;

    public NumberPrinter(int start, int max) {
        this.start = start;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = start; i <= max; i += 3) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ParallelNumberPrinting {
    public static void main(String[] args) {
        int maxNumber = 10;

        Thread t1 = new Thread(new NumberPrinter(1, maxNumber), "T1");
        Thread t2 = new Thread(new NumberPrinter(2, maxNumber), "T2");
        Thread t3 = new Thread(new NumberPrinter(3, maxNumber), "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
