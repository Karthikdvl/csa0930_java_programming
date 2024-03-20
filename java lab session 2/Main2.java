class Parent {
    int a, b;

    Parent() {
        a = 10;
        b = 15;
    }

    Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println("a = " + a + ", b = " + b);
    }
}

class Child extends Parent {
    Child() {
        super();
    }

    Child(int a, int b) {
        super(a, b);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.disp();  // Call default constructor

        Child child2 = new Child(20, 25);
        child2.disp();  // Call parameterized constructor
    }
}
