import java.util.Scanner;
import java.util.Arrays;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        
        char[] charArray = word.toCharArray();

        Arrays.sort(charArray);

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }

        System.out.print("Alphabetical Order: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        
        sc.close();
    }
}
