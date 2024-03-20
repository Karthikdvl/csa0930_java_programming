public class ShiftValuesExample20 {
    public static void main(String[] args) {
        int[] A = {5, 8, 3, 12, 6}; // Example array A
        int[] B = {3, 4, 9, 5, 10}; // Example array B

        if (A.length != B.length) {
            System.out.println("Arrays A and B must have the same length.");
            return;
        }

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > B[i]) {
                // Shift right to left
                result[i] = A[i] >>> 1; // Logical right shift by 1 position
            } else {
                // Shift left to right
                result[i] = A[i] << 1; // Logical left shift by 1 position
            }
        }

        System.out.println("Resulting array after shifting:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
