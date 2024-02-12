import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = sc.nextInt();

    sc.close();

    if (isArmstrong(number)) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }

  public static boolean isArmstrong(int num) {
  
    int digits = 0;
    int temp = num;
    while (temp > 0) {
      digits++;
      temp /= 10;
    }

    int sum = 0;
    temp = num;
    while (temp > 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, digits);
      temp /= 10;
    }

    return sum == num;
  }
}
