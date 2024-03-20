class Example {
    int number;

    // a) Referencing instance variable
    void setNumber(int number) {
        this.number = number; // 'this' refers to the instance variable 'number'
    }

    // b) Invoking another constructor
    Example() {
        this(0); // Invokes the constructor with one parameter
    }

    Example(int number) {
        this.number = number;
    }

    // c) Passing current object as a parameter
    void printObject(Example obj) {
        System.out.println("Object number: " + obj.number);
    }

    // d) Returning current object
    Example getThis() {
        return this; // Returns the current object
    }
}

public class Main11 {
    public static void main(String[] args) {
        Example example1 = new Example();
        example1.setNumber(10);
        System.out.println("Number set using this keyword: " + example1.number);

        Example example2 = new Example(20);
        System.out.println("Number set using constructor with parameter: " + example2.number);

        Example example3 = new Example();
        example3.printObject(example3); // Passing current object as parameter

        Example example4 = new Example();
        Example returnedObj = example4.getThis(); // Returning current object
        System.out.println("Number returned using this keyword: " + returnedObj.number);
    }
}
