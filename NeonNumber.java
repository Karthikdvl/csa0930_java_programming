import java.util.Scanner;

public class NeonNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = sc.nextInt();

    sc.close();

    int square = number * number;

    int sum = 0;

    while (square != 0) {
      sum += square % 10;
      square /= 10;
    }

    if (sum == number) {
      System.out.println(number + " is a neon number.");
    } else {
      System.out.println(number + " is not a neon number.");
    }
  }
}
