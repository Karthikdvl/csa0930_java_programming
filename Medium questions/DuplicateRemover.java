import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        Set<Integer> uniqueElements = new HashSet<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            uniqueElements.add(arr[i]);
        }

        System.out.println("Non-duplicate items:");
        System.out.println(uniqueElements);
    }
}
