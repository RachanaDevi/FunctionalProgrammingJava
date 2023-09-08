package programming.exercise3;

import java.util.List;
import java.util.function.Predicate;

import static programming.common.Inputs.numbers;

public class BehaviourParameterization {

    public static void main(String[] args) {
        filterAndPrint(numbers, number -> number % 2 == 0);

        filterAndPrint(numbers, number -> number % 2 != 0);
        // you're passing the logic of the method as a parameter which is known as
        // behaviour parameterization
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> evenPredicate) {
        numbers.stream()
                .filter(evenPredicate)
                .forEach(System.out::println);
    }
}
