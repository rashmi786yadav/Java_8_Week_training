package com.designpatter.creational.prototype;

// Prototype interface
interface Prototype {
    Prototype clone();
}

// Concrete prototype class
class ConcretePrototype implements Prototype {
    private int value;

    public ConcretePrototype(int value) {
        this.value = value;
    }

    public Prototype clone() {
        return new ConcretePrototype(this.value);
    }

    public int getValue() {
        return value;
    }
}

