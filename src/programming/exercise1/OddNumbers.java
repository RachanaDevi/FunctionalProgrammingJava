package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.numbers;

public class OddNumbers {

    public static void main(String[] args) {
        printAllOddNumberInFunctionalWay(numbers);
    }

    private static void printAllOddNumberInFunctionalWay(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }
}
