import java.util.Scanner;

public class VotingCalculator12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentYear = 2073;
        int eligibilityAge = 21;

        // Calculate birth year
        int birthYear = currentYear - eligibilityAge;

        if (birthYear > 2060) {
            // Scenario 1: Birth Year > 2060
            int yearsSinceEligible = currentYear - birthYear;
            System.out.println("You have been eligible to vote for " + yearsSinceEligible + " years.");
        } else {
            // Scenario 2: Birth Year <= 2060
            int medianYear = (birthYear + 2023) / 2;
            System.out.println("Your birth year is approximately " + birthYear);
            System.out.println("The median year between your birth year and 2023 is " + medianYear);
        }
    }
}
