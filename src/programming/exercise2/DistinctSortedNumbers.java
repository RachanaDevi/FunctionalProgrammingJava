package programming.exercise2;

import java.util.List;

import static programming.common.Inputs.numbers;

public class DistinctSortedNumbers {

    public static void main(String[] args) {
        getDistinctSorted(numbers);
    }

    private static void getDistinctSorted(List<Integer> numbers) {
        numbers.stream().distinct().sorted().forEach(System.out::println);
    }
}
