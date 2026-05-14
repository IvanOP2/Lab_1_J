package ua.edu.chnu.kkn.design_patterns.lambdas_lab4;

import java.util.*;
import java.util.stream.*;

public class LambdaTasks {
    // 1. Непарні числа
    public static List<Integer> getOddNumbers(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 != 0)
                .toList();
    }

    // 2. Середнє значення
    public static double getAverage(List<Double> list) {
        return list.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

    // 3. Сортування рядків (алфавіт)
    public static List<String> sortStrings(List<String> list) {
        return list.stream()
                .sorted((a, b) -> a.compareTo(b))
                .toList();
    }

    // 4. Сума парних
    public static int sumEven(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // 5. Факторіал
    public static long factorial(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    // 6. Добуток і сума
    public static int sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

    public static int product(List<Integer> list) {
        return list.stream().reduce(1, (a, b) -> a * b);
    }

    // 7. Квадрати
    public static List<Integer> squares(List<Integer> list) {
        return list.stream()
                .map(n -> n * n)
                .toList();
    }

    // 8. Сортування по довжині
    public static List<String> sortByLength(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }

    // 9. Кількість слів
    public static long countWords(String sentence) {
        return Arrays.stream(sentence.trim().split("\\s+"))
                .count();
    }

    // 10. Перший непорожній рядок
    public static String firstNonEmpty(List<String> list) {
        return list.stream()
                .filter(s -> s != null && !s.isBlank())
                .findFirst()
                .orElse(null);
    }

    // 11. Всі з великої літери
    public static boolean allCapitalized(List<String> list) {
        return list.stream()
                .allMatch(s -> Character.isUpperCase(s.charAt(0)));
    }

    // 12. Друге найбільше
    public static int secondLargest(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
    }

    // 13. Найбільше парне
    public static int maxEven(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo)
                .orElse(-1);
    }
}
