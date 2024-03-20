class RestrictedGeneric<T extends Number> {
    private T value;

    public RestrictedGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class Main16 {
    public static void main(String[] args) {
        RestrictedGeneric<Integer> intGeneric = new RestrictedGeneric<>(10);
        intGeneric.display();

        RestrictedGeneric<Double> doubleGeneric = new RestrictedGeneric<>(3.14);
        doubleGeneric.display();

       
    }
}
