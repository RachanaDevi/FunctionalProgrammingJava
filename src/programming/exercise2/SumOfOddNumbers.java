package programming.exercise2;

import java.util.List;

import static programming.common.Inputs.numbers;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        System.out.println("Sum :" + sumOfOddNumbers(numbers));
    }

    private static Integer sumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 != 0).reduce(0, Integer::sum);
    }
}
