package programming.exercise2;

import java.util.List;

import static programming.common.Inputs.numbers;

public class SortedNumbers {

    public static void main(String[] args) {
        getSorted(numbers);
    }

    private static void getSorted(List<Integer> numbers) {
        numbers.stream().sorted().forEach(System.out::println);
    }
}
