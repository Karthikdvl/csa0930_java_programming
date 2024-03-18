import java.util.Scanner;

public class NumberAverager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter -1 to exit...");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int positiveSum = 0;
        int positiveCount = 0;
        int negativeSum = 0;
        int negativeCount = 0;

        while (num != -1) {
            if (num > 0) {
                positiveSum += num;
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
                negativeCount++;
            }
            System.out.print("Enter the number: ");
            num = scanner.nextInt();
        }

        double positiveAverage = (positiveCount > 0) ? (double) positiveSum / positiveCount : 0;
        double negativeAverage = (negativeCount > 0) ? (double) negativeSum / negativeCount : 0;

        System.out.println("The average of negative numbers is: " + negativeAverage);
        System.out.println("The average of positive numbers is: " + positiveAverage);
    }
}
