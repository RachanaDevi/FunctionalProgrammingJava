package programming.exercise2;

import java.util.List;

import static programming.common.Inputs.numbers;

public class SumOfSquareOfEveryNumber {

    public static void main(String[] args) {
        System.out.println("Sum :" + sumOfSquaredNumbers(numbers));
    }

    private static Integer sumOfSquaredNumbers(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number).reduce(0, Integer::sum);
    }

}