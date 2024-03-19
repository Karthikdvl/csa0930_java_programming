import java.util.Scanner;

public class ProvidentFundCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the employee's PF amount: ");
            double pfAmount = scanner.nextDouble();

            // Assuming a fixed interest rate for PF (you can modify this value)
            double interestRate = 8.5; // Example: 8.5% interest rate

            // Calculate the interest
            double interest = (pfAmount * interestRate) / 100;

            System.out.println("Interest earned on PF: $" + interest);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner (cleanup)
            scanner.close();
        }
    }
}
