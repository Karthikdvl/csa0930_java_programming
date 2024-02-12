import java.util.Scanner;

public class BuzzNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = sc.nextInt();

    sc.close();

    if (number % 10 == 7 || number % 7 == 0) {
      System.out.println(number + " is a buzz number.");
    } else {
      System.out.println(number + " is not a buzz number.");
    }
  }
}
