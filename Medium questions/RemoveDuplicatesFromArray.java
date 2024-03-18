import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        int[] arr = new int[numElements];
        Set<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            uniqueElements.add(arr[i]);
        }

        // Convert the set back to an array
        int[] nonDuplicateItems = new int[uniqueElements.size()];
        int index = 0;
        for (int element : uniqueElements) {
            nonDuplicateItems[index++] = element;
        }

        System.out.println("Non-duplicate items:");
        System.out.println(Arrays.toString(nonDuplicateItems));
    }
}
