class MyThread extends Thread {
    private int delay;

    // Constructor for MyThread
    public MyThread(String name, int d) {
        super(name); // Calls Thread class constructor with the given thread name
        delay = d;   // Time for which the thread sleeps
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " Thread is Running");
            try {
                // Put the thread to sleep for the specified delay
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " thread is finished");
    }
}

public class ThreadManipulation {
    public static void main(String[] args) {
        System.out.println("Main Thread Starts");

        // Create three MyThread instances
        MyThread t1 = new MyThread("First", 500);
        MyThread t2 = new MyThread("Second", 300);
        MyThread t3 = new MyThread("Third", 600);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread is Finished");
    }
}
