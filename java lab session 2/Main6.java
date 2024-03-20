interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    double div(int a, int b);
}

class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a number
        }
        return (double) a / b;
    }
}

public class Main6 {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        // Test the implemented methods
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.sub(10, 5));
        System.out.println("Multiplication: " + calculator.mul(10, 5));
        System.out.println("Division: " + calculator.div(10, 5));
    }
}
