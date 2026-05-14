package ua.edu.chnu.kkn.design_patterns.functional_patterns_lab5;

import java.util.function.Consumer;

public class ExecuteAroundExample {

    static void withResource(Consumer<String> action) {

        String resource = "RESOURCE OPENED";

        try {
            action.accept(resource);
        } finally {
            System.out.println("RESOURCE CLOSED");
        }
    }

    public static void main(String[] args) {

        withResource(r -> {
            System.out.println("Working with: " + r);
        });
    }
}
