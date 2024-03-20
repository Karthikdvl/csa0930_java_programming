interface Tree {
    void fruits(String type, int count);
    void leaves(String color, int count, boolean isEvergreen);
    void flowers(String color, int count, boolean hasScent, boolean hasPollen);
}

class Branch1 implements Tree {
    @Override
    public void fruits(String type, int count) {
        System.out.println("Branch1: " + count + " " + type + " fruits");
    }

    @Override
    public void leaves(String color, int count, boolean isEvergreen) {
        System.out.println("Branch1: " + count + " " + color + " leaves, evergreen: " + isEvergreen);
    }

    @Override
    public void flowers(String color, int count, boolean hasScent, boolean hasPollen) {
        System.out.println("Branch1: " + count + " " + color + " flowers, scent: " + hasScent + ", pollen: " + hasPollen);
    }
}

class Branch2 implements Tree {
    @Override
    public void fruits(String type, int count) {
        System.out.println("Branch2: " + count + " " + type + " fruits");
    }

    @Override
    public void leaves(String color, int count, boolean isEvergreen) {
        System.out.println("Branch2: " + count + " " + color + " leaves, evergreen: " + isEvergreen);
    }

    @Override
    public void flowers(String color, int count, boolean hasScent, boolean hasPollen) {
        System.out.println("Branch2: " + count + " " + color + " flowers, scent: " + hasScent + ", pollen: " + hasPollen);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Branch1 branch1 = new Branch1();
        branch1.fruits("Apple", 5);
        branch1.leaves("Green", 100, true);
        branch1.flowers("White", 10, true, true);

        Branch2 branch2 = new Branch2();
        branch2.fruits("Orange", 8);
        branch2.leaves("Yellow", 120, false);
        branch2.flowers("Pink", 15, true, false);
    }
}
