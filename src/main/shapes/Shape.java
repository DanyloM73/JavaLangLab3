package main.shapes;

import main.interfaces.Drawable;

public abstract class Shape implements Drawable {
    public String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape color: " + shapeColor + ", Area: " + calcArea();
    }

    public abstract void draw();
}

