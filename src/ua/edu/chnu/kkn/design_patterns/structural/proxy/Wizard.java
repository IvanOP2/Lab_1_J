package ua.edu.chnu.kkn.design_patterns.structural.proxy;

public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
