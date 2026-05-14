package ua.edu.chnu.kkn.design_patterns.lambdas_lab4;
import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        List<String> strings = List.of("banana", "apple", "cherry");

        System.out.println("1. Odd numbers: " +
                LambdaTasks.getOddNumbers(numbers));

        System.out.println("2. Average: " +
                LambdaTasks.getAverage(doubles));

        System.out.println("3. Sorted strings: " +
                LambdaTasks.sortStrings(strings));

        System.out.println("4. Sum even: " +
                LambdaTasks.sumEven(numbers));

        System.out.println("5. Factorial: " +
                LambdaTasks.factorial(5));

        System.out.println("6. Sum: " +
                LambdaTasks.sum(numbers));

        System.out.println("6. Product: " +
                LambdaTasks.product(numbers));

        System.out.println("7. Squares: " +
                LambdaTasks.squares(numbers));

        System.out.println("8. Sort by length: " +
                LambdaTasks.sortByLength(strings));

        System.out.println("9. Word count: " +
                LambdaTasks.countWords("Hello world from Java"));

        System.out.println("10. First non-empty: " +
                LambdaTasks.firstNonEmpty(List.of("", " ", "Java", "Test")));

        System.out.println("11. All capitalized: " +
                LambdaTasks.allCapitalized(List.of("Java", "Stream", "API")));

        System.out.println("12. Second largest: " +
                LambdaTasks.secondLargest(numbers));

        System.out.println("13. Max even: " +
                LambdaTasks.maxEven(numbers));
    }
}
