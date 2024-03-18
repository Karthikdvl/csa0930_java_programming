import java.util.Scanner;

public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input denominations and their corresponding notes
        System.out.print("Enter the 1st Denomination: ");
        int denomination1 = scanner.nextInt();
        System.out.print("Enter the 1st Denomination number of notes: ");
        int notes1 = scanner.nextInt();

        System.out.print("Enter the 2nd Denomination: ");
        int denomination2 = scanner.nextInt();
        System.out.print("Enter the 2nd Denomination number of notes: ");
        int notes2 = scanner.nextInt();

        System.out.print("Enter the 3rd Denomination: ");
        int denomination3 = scanner.nextInt();
        System.out.print("Enter the 3rd Denomination number of notes: ");
        int notes3 = scanner.nextInt();

        System.out.print("Enter the 4th Denomination: ");
        int denomination4 = scanner.nextInt();
        System.out.print("Enter the 4th Denomination number of notes: ");
        int notes4 = scanner.nextInt();

        // Calculate total available balance
        int totalBalance = (denomination1 * notes1) +
                           (denomination2 * notes2) +
                           (denomination3 * notes3) +
                           (denomination4 * notes4);

        System.out.println("Total Available Balance in ATM: " + totalBalance);
    }
}
