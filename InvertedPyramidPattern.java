import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
    
        printInvertedPyramidPattern(rows);
        
        sc.close();
    }
    
    public static void printInvertedPyramidPattern(int rows) {
        
        for (int i = 0; i < rows; i++) {
          
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("*");
            }
          
            System.out.println();
        }
    }
}
