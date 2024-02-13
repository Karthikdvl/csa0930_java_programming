import java.util.Scanner;

public class LCM_GCD {

  public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

     public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

     public static void lcm_gcd(int[] arr) {
        
        int lcm = arr[0];
        int gcd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            gcd = gcd(arr[i], lcm);
            lcm = lcm(arr[i], lcm);
        }

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        lcm_gcd(arr);
    }
}
