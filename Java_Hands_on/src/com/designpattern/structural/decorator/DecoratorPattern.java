package com.designpattern.structural.decorator;

// Component interface
interface Pizza {
    String getDescription();
    double getCost();
}

// Concrete component
class PlainPizza implements Pizza {
    public String getDescription() {
        return "Plain pizza";
    }

    public double getCost() {
        return 4.99;
    }
}

// Decorator abstract class
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}

// Concrete decorators
class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}

class TomatoSauce extends PizzaDecorator {
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost() {
        return pizza.getCost() + 0.75;
    }
}



