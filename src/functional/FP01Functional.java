package functional;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        var numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printNumbers(numbersList);
        printNumbersStream(numbersList);
        printAllNumbersFunctional(numbersList);
    }

    public static void printNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void printNumbersStream(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    public static void print(int number) {
        System.out.printf("%d", number);
    }

    public static void printAllNumbersFunctional(List<Integer> numbers) {
        numbers.stream().forEach(FP01Functional::print);
    }
}
