public class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char c : tiles.toCharArray()) {
            count[c - 'A']++;
        }
        return dfs(count);
    }

    private int dfs(int[] count) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                sum++;
                count[i]--;
                sum += dfs(count);
                count[i]++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LetterTilePossibilities solution = new LetterTilePossibilities();
        String tiles = "AAB";
        int result = solution.numTilePossibilities(tiles);
        System.out.println("Output: " + result);
    }
}
