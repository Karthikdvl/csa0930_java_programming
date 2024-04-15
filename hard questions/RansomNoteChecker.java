import java.util.Arrays;


public class RansomNoteChecker {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0) {
            return true;
        }
        if (magazine == null || magazine.length() == 0) {
            return false;
        }

        // Create an array to track whether a character in the magazine has been used
        boolean[] visited = new boolean[magazine.length()];
        Arrays.fill(visited, false);

        for (int i = 0; i < ransomNote.length(); i++) {
            boolean flag = false; // Flag to indicate if a match was found
            for (int j = 0; j < magazine.length(); j++) {
                if (ransomNote.charAt(i) == magazine.charAt(j) && !visited[j]) {
                    visited[j] = true; // Mark the character as used
                    flag = true; // Set the flag to true
                    break; // Exit the inner loop
                }
            }
            if (!flag) {
                return false; // If no match found, return false
            }
        }
        return true; // If all characters in ransomNote are matched, return true
    }

    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Output for Example 1: " + canConstruct(ransomNote1, magazine1)); // Output: false

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Output for Example 2: " + canConstruct(ransomNote2, magazine2)); // Output: false

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Output for Example 3: " + canConstruct(ransomNote3, magazine3)); // Output: true
    }
}
