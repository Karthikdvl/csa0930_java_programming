// IterF1.java
interface IterF1 {
    int a = 50;
    int b = 30;

    void add();
    void sub();
}

// Overload_Demo.java
public class Overload_Demo implements IterF1 {
    public void add() {
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
    }

    public void sub() {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    public static void main(String[] args) {
        Overload_Demo obj = new Overload_Demo();
        obj.add();
        obj.sub();
    }
}
