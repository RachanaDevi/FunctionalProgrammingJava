package programming;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInFunctionalWay(numbers);
        printAllNumbersInStructured(numbers);
    }

    private static void printAllNumbersInFunctionalWay(List<Integer> numbers) {
        // create a stream of numbers
        numbers.stream()
                // we don't want it to immediately execute, so we pass method reference
                .forEach(System.out::println); // Method reference
    }

    private static void printAllNumbersInStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
