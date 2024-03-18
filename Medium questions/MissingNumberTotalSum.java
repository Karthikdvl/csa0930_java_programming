import java.util.Scanner;

public class MissingNumberTotalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter the elements of the array (excluding the missing number):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the expected sum of all elements from 1 to n
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing element is the difference between expected and actual sum
        int missingElement = expectedSum - actualSum;
        System.out.println("Missing Element is: " + missingElement);
    }
}
