import java.util.Scanner;

public class HarshadNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = sc.nextInt();

    sc.close();

    if (isHarshad(number)) {
      System.out.println(number + " is a harshad number.");
    } else {
      System.out.println(number + " is not a harshad number.");
    }
  }

  public static boolean isHarshad(int num) {
    
    int sum = 0;
    int temp = num;
    while (temp > 0) {
      sum += temp % 10;
      temp /= 10;
    }

    return num % sum == 0;
  }
}
