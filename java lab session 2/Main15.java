public class Main15 {

    // Generic method to find the maximum value in an array of any comparable type
    public static <T extends Comparable<T>> T findMax(T[] arr) {
      T max = arr[0];
      for (int i = 1; i < arr.length; i++) {
        if (arr[i].compareTo(max) > 0) {
          max = arr[i];
        }
      }
      return max;
    }
  
    // Another generic method to swap elements in an array of any type
    public static <T> void swap(T[] arr, int i, int j) {
      T temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  
    public static void main(String[] args) {
      // Example 1: Finding maximum value in an Integer array
      Integer[] intArr = { 3, 5, 1, 8, 6 };
      Integer maxInt = findMax(intArr);
      System.out.println("Maximum value in Integer array: " + maxInt);
  
      // Example 2: Swapping elements in a String array
      String[] stringArr = { "apple", "banana", "orange" };
      swap(stringArr, 0, 2);
      System.out.println("Swapped String array: " + String.join(", ", stringArr));
    }
  }
  