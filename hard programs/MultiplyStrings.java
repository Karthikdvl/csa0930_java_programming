import java.math.BigInteger;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return String.valueOf(n1.multiply(n2));
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String product = multiply(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + ": " + product);
    }
}
