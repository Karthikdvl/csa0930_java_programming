import java.util.Scanner;

public class SkipNumbers {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of M, N, and K:");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = M; i <= N; i += K+1) {
          
            System.out.print(i + ", ");
        }
    }
}
