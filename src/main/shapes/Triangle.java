package main.shapes;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(String shapeColor, double base, double height) {
        super(shapeColor);
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height of triangle must be positive numbers.");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "TRIANGLE -- Base: " + this.base + ", Height: " + this.height + ", " + super.toString();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle...");
    }
}

