package com.designpattern.structural.composite;

public class CompositePatternExample {
    public static void main(String[] args) {
        Employee developer1 = new Developer("John", "Senior Developer");
        Employee developer2 = new Developer("Alice", "Junior Developer");

        Manager manager = new Manager("Bob", "Development Manager");
        manager.addSubordinate(developer1);
        manager.addSubordinate(developer2);

        Employee developer3 = new Developer("Mike", "Intern");
        Employee developer4 = new Developer("Emily", "Software Engineer");

        Manager manager2 = new Manager("Sarah", "Project Manager");
        manager2.addSubordinate(developer3);
        manager2.addSubordinate(developer4);
        manager2.addSubordinate(manager);

        manager2.showDetails();
    }
}
