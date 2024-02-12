import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text(include special characters):");
        String line = scanner.nextLine();

        String specialCharacters = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

        int specialCharCount = 0;
        System.out.println("Special characters in the line:");
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (specialCharacters.contains(Character.toString(ch))) {
                System.out.print(ch + " ");
                specialCharCount++;
            }
        }
        System.out.println("\nNumber of special characters: " + specialCharCount);
    }
}
