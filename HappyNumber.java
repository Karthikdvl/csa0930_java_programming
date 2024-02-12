import java.util.Scanner;
import java.util.HashSet;

public class HappyNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = sc.nextInt();

    sc.close();

    if (isHappy(number)) {
      System.out.println(number + " is a happy number.");
    } else {
      System.out.println(number + " is not a happy number.");
    }
  }

  public static boolean isHappy(int num) {

    HashSet<Integer> seen = new HashSet<>();

  
    while (num != 1 && !seen.contains(num)) {
    
      seen.add(num);
  
      num = digitSquareSum(num);
    }

    return num == 1;
  }

  public static int digitSquareSum(int num) {
    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      sum += digit * digit;
      num /= 10;
    }
    return sum;
  }
}
