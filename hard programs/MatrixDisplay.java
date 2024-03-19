import java.util.Scanner;

public class MatrixDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix (row-wise):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix (column-wise):");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
