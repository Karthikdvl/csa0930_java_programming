import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
 
        printNumberPattern(rows);
        
        sc.close();
    }
    
    public static void printNumberPattern(int rows) {
      
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
    
            System.out.println();
        }
    }
}
