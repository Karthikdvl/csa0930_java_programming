public class GreatestAmongThree10 {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 7.2;
        double num3 = 12.8;

        // Nested if statements to find the greatest value
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("The largest number is: " + num1);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }
    }
}
