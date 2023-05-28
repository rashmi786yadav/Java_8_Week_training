package com.designpatter.creational;

// Product class
class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    // Private constructor
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Builder class
    static class Builder {
        private String brand;
        private String model;
        private int year;
        private String color;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Creating a car using the builder
        Car car = new Car.Builder()
                .setBrand("Toyota")
                .setModel("Camry")
                .setYear(2022)
                .setColor("Red")
                .build();

        // Accessing the car's properties
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
    }
}
