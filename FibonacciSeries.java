import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + "\t" + secondTerm);

        for (int i = 3; i <= n; i++) {
    
            int nextTerm = firstTerm + secondTerm;

            System.out.print("\t" + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
