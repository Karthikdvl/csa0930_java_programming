import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Character to be printed: ");
        char character = sc.next().charAt(0);
    
        System.out.print("Max Number of times printed: ");
        int maxTimes = sc.nextInt();
        
        printPattern(character, maxTimes);
        
        sc.close();
    }
    
    public static void printPattern(char character, int maxTimes) {
        
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
