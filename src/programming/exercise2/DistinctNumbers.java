package programming.exercise2;

import java.util.List;

import static programming.common.Inputs.numbers;

public class DistinctNumbers {
    public static void main(String[] args) {
        getAllDistinctNumbers(numbers);
    }

    private static void getAllDistinctNumbers(List<Integer> numbers) {
        numbers.stream().distinct().forEach(System.out::println);
    }
}
