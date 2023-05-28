package com.designpattern.structural.composite;

import com.week5.streamapi.SecondMinimum;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Component interface
interface Employee {
    void showDetails();
}

// Leaf class
class Developer implements Employee {
    Logger logger = Logger.getLogger(Developer.class.getName());
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void showDetails() {
        logger.log(Level.INFO,"Developer: " + name + ", Position: " + position);
    }
}

// Composite class
class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates;

    Logger logger = Logger.getLogger(Manager.class.getName());
    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }
    public void showDetails() {
       logger.log(Level.INFO,"Manager: " + name + ", Position: " + position);
       logger.log(Level.INFO,"Subordinates:");
        for (Employee employee : subordinates) {
            employee.showDetails();
        }
    }
}

// Client code

