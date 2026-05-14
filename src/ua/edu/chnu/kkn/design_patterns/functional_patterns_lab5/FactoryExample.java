package ua.edu.chnu.kkn.design_patterns.functional_patterns_lab5;

import java.util.function.Supplier;

class Car {
    String name;
    Car(String name) { this.name = name; }
}

public class FactoryExample {

    static Supplier<Car> toyota = () -> new Car("Toyota");
    static Supplier<Car> bmw = () -> new Car("BMW");

    public static void main(String[] args) {
        System.out.println(toyota.get().name);
        System.out.println(bmw.get().name);
    }
}
