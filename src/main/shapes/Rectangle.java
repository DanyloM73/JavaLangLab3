package main.shapes;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height of rectangle must be positive numbers.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "RECTANGLE -- Width: " + this.width + ", Height: " + this.height + ", " + super.toString();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}
