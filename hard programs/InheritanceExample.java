class Parent {
    public void displayParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("This is child class");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the parent class
        Parent parentObj = new Parent();
        parentObj.displayParent(); // Call method of parent class

        // Create an object of the child class
        Child childObj = new Child();
        childObj.displayChild(); // Call method of child class

        // Call method of parent class using child object
        childObj.displayParent();
    }
}
