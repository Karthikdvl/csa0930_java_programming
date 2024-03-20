class Shape {
    private String color;
  
    public Shape(String color) {
      this.color = color;
    }
  
    public String getColor() {
      return color;
    }
  }
  
  class Rectangle extends Shape {
    private int width;
    private int height;
  
    public Rectangle(String color, int width, int height) {
      // Call superclass constructor with color
      super(color);
      this.width = width;
      this.height = height;
    }
  
    public int getArea() {
      return width * height;
    }
  
    public void printDetails() {
      // Access superclass member (color) using super
      System.out.println("Color: " + super.getColor());
      System.out.println("Width: " + width);
      System.out.println("Height: " + height);
      System.out.println("Area: " + getArea());
    }
  }
  
  public class Main12 {
    public static void main(String[] args) {
      Rectangle rectangle = new Rectangle("Red", 5, 10);
      rectangle.printDetails();
    }
  }
  