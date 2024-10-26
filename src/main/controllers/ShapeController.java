package main.controllers;

import main.shapes.Shape;
import main.views.ShapeView;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeController {
    private final Shape[] shapes;
    private final ShapeView view;

    public ShapeController(Shape[] shapes, ShapeView view) {
        this.shapes = shapes;
        this.view = view;
    }

    public void displayShapes() {
        view.displayMessage(view.ALL_SHAPES_TITLE);
        view.displayShapes(shapes);
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calcArea();
        }
        view.displayTotalArea(totalArea);
        return totalArea;
    }

    public double calculateTotalAreaByType(Class<? extends Shape> shapeType) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            if (shapeType.isInstance(shape)) {
                totalArea += shape.calcArea();
            }
        }
        view.displayAreaByType(shapeType.getSimpleName(), totalArea);
        return totalArea;
    }

    public void sortByArea() {
        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.calcArea(), s2.calcArea());
            }
        });
        view.displayMessage(view.AREA_SORTED_SHAPES_TITLE);
        view.displayShapes(shapes);
    }

    public void sortByColor() {
        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return s1.shapeColor.compareTo(s2.shapeColor);
            }
        });
        view.displayMessage(view.COLOR_SORTED_SHAPES_TITLE);
        view.displayShapes(shapes);
    }
}
