class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class Main14 {
    public static void main(String[] args) {
        // Creating a Pair with Integer key and String value
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());

        // Creating a Pair with String key and Double value
        Pair<String, Double> pair2 = new Pair<>("PI", 3.14);
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
    }
}
