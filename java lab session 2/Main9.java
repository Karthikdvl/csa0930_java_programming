public class Main9 {

    // a) Static variable
    static int staticVariable = 10;

    // b) Static method
    static void staticMethod() {
        System.out.println("Inside static method. Static variable value: " + staticVariable);
    }

    // c) Static block
    static {
        System.out.println("Inside static block");
    }

    // d) Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static variable value: " + staticVariable);

        // Accessing static method
        staticMethod();

        // Creating an object of static nested class and accessing its method
        StaticNestedClass nestedObj = new StaticNestedClass();
        nestedObj.display();
    }
}
