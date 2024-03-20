import java.util.Arrays;

abstract class AbstractStatistics {
    abstract int total(int[] nums);
    abstract double average(int[] nums);

    double mean(int[] nums) {
        int total = total(nums);
        return (double) total / nums.length;
    }

    int mode(int[] nums) {
        int mode = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; ++i) {
            int count = 0;
            for (int j = 0; j < nums.length; ++j) {
                if (nums[j] == nums[i]) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = nums[i];
            }
        }
        return mode;
    }

    double median(int[] nums) {
        Arrays.sort(nums);
        int middle = nums.length / 2;
        if (nums.length % 2 == 0) {
            return (nums[middle - 1] + nums[middle]) / 2.0;
        } else {
            return nums[middle];
        }
    }
}

class ConcreteStatistics extends AbstractStatistics {
    @Override
    int total(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    @Override
    double average(int[] nums) {
        return total(nums) / (double) nums.length;
    }
}

public class Main5 {
    public static void main(String[] args) {
        ConcreteStatistics concreteStats = new ConcreteStatistics();
        int[] numbers = {3, 5, 7, 5, 2, 7, 3, 8, 3, 9};

        System.out.println("Total: " + concreteStats.total(numbers));
        System.out.println("Average: " + concreteStats.average(numbers));
        System.out.println("Mean: " + concreteStats.mean(numbers));
        System.out.println("Mode: " + concreteStats.mode(numbers));
        System.out.println("Median: " + concreteStats.median(numbers));
    }
}
