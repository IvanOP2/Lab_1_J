package ua.edu.chnu.kkn.design_patterns.functional_patterns_lab5;

import java.util.function.Function;

public class DecoratorExample {

    public static void main(String[] args) {

        Function<String, String> addSmile = s -> s + " :)";
        Function<String, String> upper = String::toUpperCase;

        Function<String, String> decorated =
                upper.andThen(addSmile);

        System.out.println(decorated.apply("hello"));
    }
}