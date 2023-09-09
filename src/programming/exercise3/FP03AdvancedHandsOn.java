package programming.exercise3;

import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

import static programming.common.Inputs.numbers;

public class FP03AdvancedHandsOn {

    public static void main(String[] args) {

        // Unary Operator
        // takes an input and gives the same datatype of output
        UnaryOperator<Integer> unaryOperator = (number) -> 3 * number;
        // same as function
        // Function<Integer, Integer> unaryOperator2 = (x) -> 3 * x;
        numbers.stream().map(unaryOperator).forEach(System.out::println);

        // BiPredicate
        BiPredicate<Integer, String> biPredicate = (number, string) -> number < 10 && string.length() > 5;
        System.out.println(biPredicate.test(15, "RachanaDevi"));

        BiFunction<Integer, String, String> biFunction = (number, string) ->
                number + " " + string;

        System.out.println(biFunction.apply(12, "Rachana"));

        //BiConsumer
        BiConsumer<String, String> biConsumer = (string1, string2) -> {
            System.out.println(string1.toUpperCase(Locale.ROOT));
            System.out.println(string2.toUpperCase(Locale.ROOT));
        };

        biConsumer.accept("Rachana", "Devi");

    }
}
