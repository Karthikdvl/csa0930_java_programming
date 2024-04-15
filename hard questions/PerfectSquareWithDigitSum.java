import java.util.ArrayList;
import java.util.List;

public class PerfectSquareWithDigitSum {
    public static void main(String[] args) {
        int lowerRange = 1; // Sample input: lower range
        int upperRange = 40; // Sample input: upper range

        List<Integer> perfectSquares = new ArrayList<>();
        for (int num = lowerRange; num <= upperRange; num++) {
            if (isPerfectSquare(num) && digitSumLessThanTen(num)) {
                perfectSquares.add(num);
            }
        }

        System.out.println(perfectSquares);
    }

    // Check if a number is a perfect square
    private static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return n == root * root;
    }

    // Check if the sum of digits of a number is less than 10
    private static boolean digitSumLessThanTen(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum < 10;
    }
}
