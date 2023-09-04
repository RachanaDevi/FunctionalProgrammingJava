package programming.exercise2;

import java.util.List;

import static programming.common.Inputs.numbers;

public class SumOfCubeOfEveryNumber {

    public static void main(String[] args) {

        System.out.println("Sum : " + sumOfCubeOf(numbers));
    }

    private static int sumOfCubeOf(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number * number).reduce(0, Integer::sum);
    }
}
