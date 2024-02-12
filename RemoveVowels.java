import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String stringWithoutVowels = removeVowels(inputString);

        System.out.println("The string without vowels is: " + stringWithoutVowels);
        
        scanner.close();
    }
    
    // Method to remove vowels from a string
    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    
    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
