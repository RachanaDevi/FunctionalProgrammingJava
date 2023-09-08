package programming.exercise3;

import java.util.function.Predicate;

import static programming.common.Inputs.numbers;

public class BehaviourParameterization {

    public static void main(String[] args) {
        Predicate<Integer> evenPredicate = number -> number % 2 == 0;
        Predicate<Integer> oddPredicate = number -> number % 2 != 0;

        printNumbers(evenPredicate);

        printNumbers(oddPredicate);
    }

    private static void printNumbers(Predicate<Integer> evenPredicate) {
        numbers.stream()
                .filter(evenPredicate)
                .forEach(System.out::println);
    }
}
