import java.util.Arrays;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] arr = {14, 67, 48, 23, 5, 62};
        int N = 5;

        Arrays.sort(arr); // Sort the array in ascending order

        if (N <= arr.length) {
            int nthLargest = arr[arr.length - N];
            System.out.println(N + "th Largest number: " + nthLargest);
        } else {
            System.out.println("Invalid value of N. The list does not have enough elements.");
        }
    }
}
