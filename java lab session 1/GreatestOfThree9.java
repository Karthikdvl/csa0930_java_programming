public class GreatestOfThree9 {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 7.2;
        double num3 = 12.8;

        // Using nested ternary operators to find the maximum
        double max = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);

        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is " + max);
    }
}
