public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            array[10] = 30 / 0; // ArithmeticException: Division by zero
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
