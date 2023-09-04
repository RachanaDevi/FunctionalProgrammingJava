package programming.exercise1;

import java.util.List;

public class OddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        printAllOddNumberInFunctionalWay(numbers);
    }

    private static void printAllOddNumberInFunctionalWay(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }
}
