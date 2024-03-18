public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            // Division operation that may throw ArithmeticException
            int result = a / b;

            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
