package programming.exercise2;

import java.util.List;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        System.out.println("Sum :" + sumOfOddNumbers(numbers));
    }

    private static Integer sumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 != 0).reduce(0, Integer::sum);
    }
}
