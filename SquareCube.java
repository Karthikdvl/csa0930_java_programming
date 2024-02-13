import java.util.Scanner;

public class SquareCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();

        double square = num * num;
        double cube = num * num * num;

        System.out.println("Square Number: " + square);
        System.out.println("Cube Number: " + cube);

        sc.close();
    }
}
