import java.util.Arrays;

public class MthMaxNthMin {
    public static void main(String[] args) {
        int[] arr = {-12, -78, -35, -42, -85 };
        int M = 3; // Mth maximum
        int N = 3; // Nth minimum

        Arrays.sort(arr); // Sort the array in ascending order

        // Mth maximum
        int maxM = arr[arr.length - M];
        // Nth minimum
        int minN = arr[N - 1];

        // Calculate sum and difference
        int sum = maxM + minN;
        int difference = maxM - minN;

        System.out.println("1st Maximum Number = " + maxM);
        System.out.println("3rd Minimum Number = " + minN);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
