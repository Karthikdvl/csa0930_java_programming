import java.util.Arrays;
public class MedianOfMergedArrays16{
    public static void main(String[] args) {
        int[] normalOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Normal order array
        int[] reverseOrder = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Reverse order array

        int[] mergedArray = new int[normalOrder.length + reverseOrder.length];
        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < normalOrder.length && j < reverseOrder.length) {
            if (normalOrder[i] < reverseOrder[j]) {
                mergedArray[k++] = normalOrder[i++];
            } else {
                mergedArray[k++] = reverseOrder[j++];
            }
        }

        // Copy remaining elements from normalOrder (if any)
        while (i < normalOrder.length) {
            mergedArray[k++] = normalOrder[i++];
        }

        // Copy remaining elements from reverseOrder (if any)
        while (j < reverseOrder.length) {
            mergedArray[k++] = reverseOrder[j++];
        }

        // Calculate the median
        int middleIndex = mergedArray.length / 2;
        double median;
        if (mergedArray.length % 2 == 0) {
            median = (mergedArray[middleIndex - 1] + mergedArray[middleIndex]) / 2.0;
        } else {
            median = mergedArray[middleIndex];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        System.out.println("Median: " + median);
    }
}
