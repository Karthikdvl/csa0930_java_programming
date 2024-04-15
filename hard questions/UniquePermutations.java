import java.util.HashSet;
import java.util.Set;

public class UniquePermutations {
    public static void main(String[] args) {
        int givenNumber = 143; // Sample input: Given Number

        Set<String> uniquePermutations = new HashSet<>();
        generatePermutations("", String.valueOf(givenNumber), uniquePermutations);

        System.out.println("Permutations are:");
        for (String permutation : uniquePermutations) {
            System.out.println(permutation);
        }
    }

    // Recursive function to generate permutations
    private static void generatePermutations(String prefix, String remaining, Set<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix); // Add the unique permutation to the set
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char currentChar = remaining.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generatePermutations(newPrefix, newRemaining, result);
        }
    }
}
