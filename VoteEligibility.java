import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else if (age >= 0) {
            int yearsLeft = 18 - age;
            System.out.println("You are allowed to vote after " + yearsLeft + " years.");
        } else {
            System.out.println("Invalid age entered.");
        }
        
        sc.close();
    }
}
