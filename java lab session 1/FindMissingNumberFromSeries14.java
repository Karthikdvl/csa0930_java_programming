import java.util.Arrays;

public class FindMissingNumberFromSeries14 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 11, 19}; // Given series
        int N = numbers[numbers.length - 1]; // The last element in the array
        int expectedSum = (N * (N + 1)) / 2; // Sum of natural numbers from 1 to N
        int actualSum = Arrays.stream(numbers).sum(); // Sum of all numbers in the given series
        int missingNumber = expectedSum - actualSum; // Calculate the missing number
        System.out.println("Missing Number: " + missingNumber);
    }
}
