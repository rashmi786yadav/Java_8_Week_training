package com.designpatter.creational;

// this class will show the singloton design pattern example
public class SingletonDesign {
    private static volatile SingletonDesign instance;

    private SingletonDesign() {

    }
// this methode is used to create instance if there is no instance otherwise this will provide existing instance
    public static SingletonDesign getInstance() {
        if (instance == null) {
            synchronized (SingletonDesign.class) {
                if (instance == null) {
                    return new SingletonDesign();
                }
            }
        }
        return instance;
    }
// this methode is used to do some activity
    public void DoSomeTask() {
        System.out.println("this is my singleton design pattern");
    }

    public static void main(String[] args) {
        SingletonDesign singletonDesign = SingletonDesign.getInstance();
        singletonDesign.DoSomeTask();
    }
}
