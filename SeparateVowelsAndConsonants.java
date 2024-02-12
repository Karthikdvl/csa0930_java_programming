import java.util.Scanner;

public class SeparateVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        separateAndPrintVowelsAndConsonants(word);
    }
    
    public static void separateAndPrintVowelsAndConsonants(String word) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.append(ch);
            } else if (Character.isLetter(ch)) {
                consonants.append(ch);
            }
        }
        
        System.out.println("Vowels: " + vowels.toString());
        System.out.println("Consonants: " + consonants.toString());
    }
}