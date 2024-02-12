import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the symbol: ");
        char symbol = sc.next().charAt(0);

        System.out.print("Enter the size of the square: ");
        int size = sc.nextInt();
  
        printHollowSquarePattern(symbol, size);
        
        sc.close();
    }
    
    public static void printHollowSquarePattern(char symbol, int size) {
     
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
