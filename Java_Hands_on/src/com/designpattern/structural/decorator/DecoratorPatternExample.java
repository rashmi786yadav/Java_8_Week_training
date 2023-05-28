package com.designpattern.structural.decorator;


import com.week5.streamapi.FrequencyMap;

import java.util.logging.Level;
import java.util.logging.Logger;

// Client code
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DecoratorPatternExample.class.getName());
        Pizza plainPizza = new PlainPizza();
        logger.log(Level.INFO,"Plain Pizza: " + plainPizza.getDescription() + ", Cost: $" + plainPizza.getCost());

        Pizza cheesePizza = new Cheese(plainPizza);
        logger.log(Level.INFO,"Cheese Pizza: " + cheesePizza.getDescription() + ", Cost: $" + cheesePizza.getCost());

        Pizza deluxePizza = new TomatoSauce(new Cheese(plainPizza));
        logger.log(Level.INFO,"Deluxe Pizza: " + deluxePizza.getDescription() + ", Cost: $" + deluxePizza.getCost());
    }
}

