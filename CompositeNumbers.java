import java.util.Scanner;

public class CompositeNumbers {

    public static boolean isComposite(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
           
            if (num % i == 0) {
                
                return true;
            }
        }
     
        return false;
    }

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A:");
        int A = sc.nextInt();
        System.out.println("Enter the value of B:");
        int B = sc.nextInt();

        System.out.println("The composite numbers between " + A + " and " + B + " are:");
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                
                System.out.print(i + " ");
            }
        }
    }
}
