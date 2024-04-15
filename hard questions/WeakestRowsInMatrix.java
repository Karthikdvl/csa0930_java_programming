import java.util.Arrays;
import java.util.PriorityQueue;

class RowStrength implements Comparable<RowStrength> {
    int row;
    int soldiers;

    public RowStrength(int row, int soldiers) {
        this.row = row;
        this.soldiers = soldiers;
    }

    @Override
    public int compareTo(RowStrength other) {
        if (this.soldiers != other.soldiers) {
            return Integer.compare(this.soldiers, other.soldiers);
        }
        return Integer.compare(this.row, other.row);
    }
}

public class WeakestRowsInMatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        PriorityQueue<RowStrength> minHeap = new PriorityQueue<>();

        for (int i = 0; i < m; i++) {
            int soldiers = countSoldiers(mat[i]);
            minHeap.offer(new RowStrength(i, soldiers));
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll().row;
        }
        return result;
    }

    private static int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k = 3;

        int[] result = kWeakestRows(mat, k);
        System.out.println("The indices of the " + k + " weakest rows are: " + Arrays.toString(result));
    }
}
