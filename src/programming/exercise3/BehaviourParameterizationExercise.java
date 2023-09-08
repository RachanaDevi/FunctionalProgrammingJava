package programming.exercise3;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static programming.common.Inputs.numbers;

public class BehaviourParameterizationExercise {

    public static void main(String[] args) {
        Function<Integer, Integer> squared = number -> number * number;
        List<Integer> squareOfNumbers = mapAndCreatedNewList(numbers, squared);

        System.out.println(squareOfNumbers);
    }

    private static List<Integer> mapAndCreatedNewList(List<Integer> numbers, Function<Integer, Integer> integerIntegerFunction) {
        return numbers
                .stream()
                .map(integerIntegerFunction)
                .collect(Collectors.toList());
    }
}
