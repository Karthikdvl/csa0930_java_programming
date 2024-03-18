import java.util.Scanner;

public class MissingNumberXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter the elements of the array (excluding the missing number):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize the result with the first element
        int result = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            result ^= i;
        }

        // XOR all array elements
        for (int num : arr) {
            result ^= num;
        }

        System.out.println("Missing Element is: " + result);
    }
}
