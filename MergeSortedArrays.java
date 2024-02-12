import java.util.ArrayList;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        
        ArrayList<Integer> mergedList = mergeArrays(arr1, arr2);
        
        System.out.println("Merged Array:");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
    
    public static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }
        
        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }
        
        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }
        
        return mergedList;
    }
}
