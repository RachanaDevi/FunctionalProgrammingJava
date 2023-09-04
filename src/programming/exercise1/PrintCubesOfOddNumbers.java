package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.numbers;

public class PrintCubesOfOddNumbers {

    public static void main(String[] args) {
        printCubesOfOddNumbers(numbers);
    }

    private static void printCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }
}
