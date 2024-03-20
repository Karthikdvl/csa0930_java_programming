public class MatrixExample5 {
    public static void main(String[] args) {
        int n = 9; // Size of the matrix (both rows and columns)

        // Create matrices A and B
        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];

        // Fill Matrix A with numbers from 1 to 9
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = num++;
            }
        }

        // Fill Matrix B with numbers from 9 to 1
        num = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[i][j] = num--;
            }
        }

        // Display Matrix A
        System.out.println("Matrix A:");
        printMatrix(matrixA);

        // Display Matrix B
        System.out.println("\nMatrix B:");
        printMatrix(matrixB);
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
