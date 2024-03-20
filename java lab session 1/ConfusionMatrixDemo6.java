public class ConfusionMatrixDemo6 {
    public static void main(String[] args) {
        // Assume binary classification (Dog vs. Not Dog)
        int actualDogCounts = 6;
        int actualNotDogCounts = 4;

        int truePositive = 5; // Model correctly predicts Dog
        int falsePositive = 1; // Model predicts Dog but it's Not Dog
        int trueNegative = 3; // Model correctly predicts Not Dog
        int falseNegative = 1; // Model predicts Not Dog but it's Dog

        // Calculate precision, recall, and F1-score
        double precision = (double) truePositive / (truePositive + falsePositive);
        double recall = (double) truePositive / (truePositive + falseNegative);
        double f1Score = 2 * (precision * recall) / (precision + recall);

        // Display results
        System.out.println("Confusion Matrix:");
        System.out.println("Actual Dog\tActual Not Dog");
        System.out.println("Predicted Dog\t" + truePositive + "\t\t" + falsePositive);
        System.out.println("Predicted Not Dog\t" + falseNegative + "\t\t" + trueNegative);
        System.out.println("\nMetrics:");
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("F1-Score: " + f1Score);
    }
}
