public class PowerCalculator {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 7;
        double result = myPow(x, n);
        System.out.printf("Output: %.5f%n", result);
    }
}
