package programming.exercise2;

import java.util.List;

public class SumOfSquareOfEveryNumber {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        System.out.println("Sum :" + sumOfSquaredNumbers(numbers));
    }

    private static Integer sumOfSquaredNumbers(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number).reduce(0, Integer::sum);
    }

}