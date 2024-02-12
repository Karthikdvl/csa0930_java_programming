import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StatsCalculator {
    public static void main(String[] args) {

        int[] array = {16, 18, 27, 16, 23, 21, 19};
        
        double mean = calculateMean(array);
        System.out.println("Mean = " + mean);

        double median = calculateMedian(array);
        System.out.println("Median = " + median);

        int mode = calculateMode(array);
        System.out.println("Mode = " + mode);
    }

    public static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }
 
    public static int calculateMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;
        
        for (int num : array) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }
        
        return mode;
    }
}
