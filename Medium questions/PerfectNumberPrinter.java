import java.util.Scanner;

public class PerfectNumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();

        int count = 0; // Counter for perfect numbers
        int num = 1; // Start checking from 1

        System.out.print("First " + n + " perfect numbers are: ");

        while (count < n) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Function to check if a number is perfect
    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
