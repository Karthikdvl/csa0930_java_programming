import java.util.Scanner;

public class LuckyGuess17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-5): ");
        int userGuess = scanner.nextInt();

        switch (userGuess) {
            case 1:
                System.out.println("Lucky guess! You chose 1.");
                break;
            case 2:
                System.out.println("Lucky guess! You chose 2.");
                break;
            case 3:
                System.out.println("Lucky guess! You chose 3.");
                break;
            case 4:
                System.out.println("Lucky guess! You chose 4.");
                break;
            case 5:
                System.out.println("Lucky guess! You chose 5.");
                break;
            default:
                System.out.println("Invalid input. Please choose a number between 1 and 5.");
        }

        scanner.close();
    }
}
