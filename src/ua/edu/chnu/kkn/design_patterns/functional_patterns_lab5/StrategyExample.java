package ua.edu.chnu.kkn.design_patterns.functional_patterns_lab5;

import java.util.function.Function;

public class StrategyExample {

    static int execute(int value, Function<Integer, Integer> strategy) {
        return strategy.apply(value);
    }

    public static void main(String[] args) {

        System.out.println(execute(10, x -> x + 5));   // add
        System.out.println(execute(10, x -> x * 2));   // multiply
    }
}
