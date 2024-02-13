public class PrintOddNumbers{
public static void printOddNumbers(int n) {
   
    for (int i = 1; i <= 2 * n - 1; i++) {
     
      if (i % 2 == 1) {
      
        System.out.print(i + " ");
      }
    
    System.out.println();
  }
}
}