package com.designpattern.structural.bridge;

import java.util.logging.Level;
import java.util.logging.Logger;

// Implementor interface
interface Color {
    void applyColor();
}

// Concrete implementor classes
class RedColor implements Color {
    Logger logger = Logger.getLogger(RedColor.class.getName());
    public void applyColor() {
       logger.log(Level.INFO,"Applying red color");
    }
}

class BlueColor implements Color {
    Logger logger = Logger.getLogger(BlueColor.class.getName());
    public void applyColor() {
        logger.log(Level.INFO,"Applying blue color");
    }
}

// Abstraction class
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}

// Refined abstraction classes
class Square extends Shape {
    Logger logger = Logger.getLogger(Square.class.getName());
    public Square(Color color) {
        super(color);
    }

    void applyColor() {
        logger.log(Level.INFO,"Square with ");
        color.applyColor();
    }
}

class Circle extends Shape {
    Logger logger = Logger.getLogger(Square.class.getName());
    public Circle(Color color) {
        super(color);
    }
    void applyColor() {
        logger.log(Level.INFO,"Circle with ");
        color.applyColor();
    }
}


