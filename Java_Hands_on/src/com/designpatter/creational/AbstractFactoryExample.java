package com.designpatter.creational;

// Abstract Product A
interface Button {
    void render();
}

// Concrete Product A1: WindowsButton
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button");
    }
}

// Concrete Product A2: MacOSButton
class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a macOS button");
    }
}

// Abstract Product B
interface Checkbox {
    void render();
}

// Concrete Product B1: WindowsCheckbox
class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox");
    }
}

// Concrete Product B2: MacOSCheckbox
class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a macOS checkbox");
    }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factory 1: WindowsFactory
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Concrete Factory 2: MacOSFactory
class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
public class AbstractFactoryExample {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();

        Button windowsButton = windowsFactory.createButton();
        windowsButton.render();

        Checkbox windowsCheckbox = windowsFactory.createCheckbox();
        windowsCheckbox.render();

        GUIFactory macOSFactory = new MacOSFactory();

        Button macOSButton = macOSFactory.createButton();
        macOSButton.render();

        Checkbox macOSCheckbox = macOSFactory.createCheckbox();
        macOSCheckbox.render();
    }
}
