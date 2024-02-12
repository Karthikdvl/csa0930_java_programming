import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        long number = sc.nextLong();
        
        long reversedNumber = reverseNumber(number);

        System.out.println("Reverse Number: " + reversedNumber);
        
        sc.close();
    }
    
    public static long reverseNumber(long number) {
        long reversedNumber = 0;
        
        while (number != 0) {
            long remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        
        return reversedNumber;
    }
}
