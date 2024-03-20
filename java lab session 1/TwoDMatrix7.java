import java.util.Arrays;

public class TwoDMatrix7 {
    public static void main(String[] args) {
        // Specify the dimensions of the matrix
        int rows = 4;
        int columns = 4;

        // Create a 2D array with the specified dimensions
        int[][] matrix = new int[rows][columns];

        // Initialize the matrix with default values (sequential integers)
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = value;
                value++;
            }
        }

        // Print the 2D matrix
        System.out.println("The 2D matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
