public class MultiplicationTableThread {
    public static void main(String[] args) {
        Thread table5Thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("5 X " + i + " = " + (5 * i));
            }
        });

        Thread table10Thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("10 X " + i + " = " + (10 * i));
            }
        });

        table5Thread.start();
        table10Thread.start();
    }
}
