import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade of the employee (A or B): ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        double bonusPercentage;
        if (salary < 10000) {
            // Additional 2% bonus for salaries less than $10,000
            bonusPercentage = (grade == 'A') ? 0.05 + 0.02 : 0.10 + 0.02;
        } else {
            bonusPercentage = (grade == 'A') ? 0.05 : 0.10;
        }

        double bonus = salary * bonusPercentage;
        double totalSalary = salary + bonus;

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid: " + totalSalary);
    }
}
