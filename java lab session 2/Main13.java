class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Main13 {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer value stored in the box: " + intBox.getValue());

        // Creating a Box for String
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello, Generics!");
        System.out.println("String value stored in the box: " + stringBox.getValue());

        // Creating a Box for Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(3.14);
        System.out.println("Double value stored in the box: " + doubleBox.getValue());
    }
}
