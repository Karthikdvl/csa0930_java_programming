// a) Final variable
class FinalVariableExample {
    final int finalVariable = 10;

    void display() {
        // Trying to modify final variable results in compilation error
        // finalVariable = 20; // Compilation error: cannot assign a value to final variable
        System.out.println("Final variable value: " + finalVariable);
    }
}

// b) Final method
class FinalMethodExample {
    final void finalMethod() {
        System.out.println("Inside final method");
    }
}

// c) Final class
final class FinalClassExample {
    void display() {
        System.out.println("Inside final class");
    }
}

// Attempting to extend a final class results in compilation error
// class SubFinalClass extends FinalClassExample {} // Compilation error: cannot inherit from final FinalClassExample

public class Main10 {
    public static void main(String[] args) {
        // Test FinalVariableExample
        FinalVariableExample variableExample = new FinalVariableExample();
        variableExample.display();

        // Test FinalMethodExample
        FinalMethodExample methodExample = new FinalMethodExample();
        methodExample.finalMethod();

        // Test FinalClassExample
        FinalClassExample classExample = new FinalClassExample();
        classExample.display();
    }
}
