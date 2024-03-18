class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent external instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        // Create the first object
        Singleton obj1 = Singleton.getInstance();
        System.out.println("First object created: " + obj1);

        // Attempt to create a second object
        try {
            Singleton obj2 = Singleton.getInstance();
            System.out.println("Second object created: " + obj2);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
