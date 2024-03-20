class Base {
    void area(int a, int b) {
        int squareArea = a * a;
        System.out.println("Area of the square with side " + a + " is: " + squareArea);
    }
}

class Derived extends Base {
    @Override
    void area(int length, int breadth) {
        int rectangleArea = length * breadth;
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + rectangleArea);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Base base = new Base();
        base.area(5, 5); // This will print area of a square
        
        Derived derived = new Derived();
        derived.area(5, 10); // This will print area of a rectangle
    }
}
