import java.util.Scanner;

public class LeapYearDate {
    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Date:");
        String date = sc.nextLine();

        String[] parts = date.split("/");
        int year = Integer.parseInt(parts[2]);

        boolean leap = isLeapYear(year);

        if (leap) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }
    }
}
