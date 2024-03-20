import java.util.Arrays;

public class EqualLengthArrays8 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 10, 20, 30 };

        // Check if arrays have equal length
        if (arr1.length == arr2.length) {
            System.out.println("Both arrays already have equal length.");
        } else {
            // Determine the smaller array
            int minLength = Math.min(arr1.length, arr2.length);

            // Adjust the smaller array to match the length of the larger array
            if (arr1.length < arr2.length) {
                arr1 = Arrays.copyOf(arr1, arr2.length);
            } else {
                arr2 = Arrays.copyOf(arr2, arr1.length);
            }

            System.out.println("Adjusted arrays to equal length:");
            System.out.println("arr1: " + Arrays.toString(arr1));
            System.out.println("arr2: " + Arrays.toString(arr2));
        }
    }
}
