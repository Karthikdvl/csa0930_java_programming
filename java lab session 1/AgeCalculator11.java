public class AgeCalculator11 {
    public static void main(String[] args) {
        int olderBrotherAgeAt56 = 56;
        int ageDifference = 4;

        // Calculate person's age at 56
        int personAgeAt56 = olderBrotherAgeAt56 + ageDifference;

        // Calculate younger brother's age when older brother was 5
        int youngerBrotherAgeAt5 = 5 - ageDifference;

        System.out.println("Person's age at 56: " + personAgeAt56);
        System.out.println("Younger brother's age at 5: " + youngerBrotherAgeAt5);
    }
}
