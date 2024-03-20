interface Summable {
    int sum(int a, int b);
}

interface Averagable {
    double avg(double[] numbers);
}

interface Percentagable {
    double percentage(double part, double total);
}

class MathOperations implements Summable, Averagable, Percentagable {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public double avg(double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    @Override
    public double percentage(double part, double total) {
        if (total == 0) {
            throw new IllegalArgumentException("Total cannot be zero.");
        }
        return (part / total) * 100;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Example usage
        int resultSum = mathOps.sum(10, 20);
        System.out.println("Sum: " + resultSum);

        double[] numbers = { 10.5, 20.5, 30.5 };
        double resultAvg = mathOps.avg(numbers);
        System.out.println("Average: " + resultAvg);

        double part = 75;
        double total = 100;
        double resultPercentage = mathOps.percentage(part, total);
        System.out.println("Percentage: " + resultPercentage + "%");
    }
}
