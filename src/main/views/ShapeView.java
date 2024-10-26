package main.views;

import main.shapes.Shape;

public class ShapeView {
    public final String ALL_SHAPES_TITLE = "\nAll shapes:";
    public final String AREA_SORTED_SHAPES_TITLE = "\nShapes sorted by area:";
    public final String COLOR_SORTED_SHAPES_TITLE = "\nShapes sorted by color:";

    public void displayShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public void displayTotalArea(double totalArea) {
        System.out.println("\nTotal area of all shapes: " + totalArea);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayAreaByType(String shapeType, double area) {
        System.out.println("\nTotal area of " + shapeType.toLowerCase() + "s: " + area);
    }
}
