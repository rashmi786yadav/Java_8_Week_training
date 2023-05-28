package com.designpatter.creational;
// shape interface
interface Shape {
    void draw();
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete Product: Rectangle
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Factory class
class ShapeFactory {
    // Factory method
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

// Client code
public class FactoryPatternExample {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // Creating a Circle using the factory
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();
        // Creating a Rectangle using the factory
        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();
    }
}
