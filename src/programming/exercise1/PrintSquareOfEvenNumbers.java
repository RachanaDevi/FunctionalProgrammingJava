package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.numbers;

public class PrintSquareOfEvenNumbers {

    public static void main(String[] args) {
        printSquareOfEvenNumbers(numbers);
    }

    private static void printSquareOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
