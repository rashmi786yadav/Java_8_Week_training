package com.designpattern.structural.bridge;

import com.week5.streamapi.SecondMinimum;

import java.util.logging.Logger;

public class BridgePatternExample {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();

        Shape redSquare = new Square(red);
        Shape blueCircle = new Circle(blue);

        redSquare.applyColor(); // Output: Square with Applying red color
        blueCircle.applyColor(); // Output: Circle with Applying blue color
    }
}