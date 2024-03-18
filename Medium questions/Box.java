public class Box {
    private double length;
    private double width;
    private double height;

    // Default constructor
    public Box() {
        // Initialize all dimensions to 1.0
        length = 5.0;
        width = 6.0;
        height = 7.0;
    }

    // Calculate and return the volume of the box
    public double calcVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box defaultBox = new Box();

        System.out.println("Default dimensions are " + defaultBox.length + " X " + defaultBox.width + " X " + defaultBox.height);
        System.out.println("Volume of the default box: " + defaultBox.calcVolume());
    }
}
