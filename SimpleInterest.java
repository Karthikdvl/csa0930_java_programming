import java.util.Scanner;

public class SimpleInterest {

    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double p = sc.nextDouble();

        System.out.println("Enter the number of years:");
        double t = sc.nextDouble();

        System.out.println("Is customer senior citizen (y/n):");
        char c = sc.next().charAt(0);

        double r;

        if (c == 'y' || c == 'Y') {
           
            r = 12;
        } else {
           
            r = 10;
        }

        double si = calculateSI(p, r, t);

        System.out.println("Interest: " + si);
    }
}
