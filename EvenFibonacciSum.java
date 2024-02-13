import java.util.Scanner;

public class EvenFibonacciSum {

    public static int fibonacci(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1 || N == 2) {
            return 1;
        } else {
            return fibonacci(N-1) + fibonacci(N-2);
        }
    }

    // Method to find the even sum of Fibonacci series till number N using the formula: S(N) = F(2N+1) - 1
    public static int evenFibonacciSum(int N) {
        return fibonacci(2*N + 1) - 1;
    }

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int N = sc.nextInt();

        int sum = evenFibonacciSum(N);

        System.out.println("Even sum of Fibonacci series till number " + N + " is: " + sum);
    }
}
