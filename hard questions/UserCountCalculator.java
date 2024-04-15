import java.util.Scanner;

public class UserCountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();

        scanner.close();

        // Calculate student users
        int nonTeachingStaffUsers = staffUsers / 3;
        int studentUsers = totalUsers - staffUsers - nonTeachingStaffUsers;

        System.out.println("Student Users: " + studentUsers);
    }
}
