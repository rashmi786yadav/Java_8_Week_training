package com.designpatter.creational.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

// client code
public class PrototypeExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(PrototypeExample.class.getName());
        ConcretePrototype original = new ConcretePrototype(10);
       logger.log(Level.INFO,"Original Value: " + original.getValue());

        ConcretePrototype cloned = (ConcretePrototype) original.clone();
        logger.log(Level.INFO,"Cloned Value: " + cloned.getValue());
    }
}