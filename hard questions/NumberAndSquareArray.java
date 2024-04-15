import java.util.Arrays;

public class NumberAndSquareArray {
    public static void main(String[] args) {
        int lowerRange = 45; // Sample input: lower range
        int upperRange = 49; // Sample input: upper range

        int arraySize = upperRange - lowerRange + 1;
        int[][] numberAndSquareArray = new int[arraySize][2];

        for (int i = 0; i < arraySize; i++) {
            int number = lowerRange + i;
            int square = number * number;
            numberAndSquareArray[i][0] = number;
            numberAndSquareArray[i][1] = square;
        }

        System.out.println("Sample Output:");
        System.out.println(Arrays.deepToString(numberAndSquareArray));
    }
}
