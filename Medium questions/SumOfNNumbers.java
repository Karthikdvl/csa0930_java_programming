import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element" + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            System.out.println("Non-duplicate items:");
            System.out.println(sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Loop variable exceeded array size.");
        }
    }
}
