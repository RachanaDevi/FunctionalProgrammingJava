package programming.exercise3;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static programming.common.Inputs.numbers;

public class FP03HandsOn {

    public static void main(String[] args) {
        // all these are functional interfaces. has only one abstract method
        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;

        // a predicate is used to test something and returns a boolean value
        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };

        // accepts one argument and returns the value
        Function<Integer, Integer> squareFunction = number -> number * number;
        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        };


        // consumes whatever it gets and does not return anything back
        Consumer<Integer> printConsumer = System.out::println;
        Consumer<Integer> printConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Supplier<Integer> randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        Supplier<Integer> randomNumber2 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 2;
            }
        };


        numbers.stream()
                .filter(isEvenPredicate2)
                .map(squareFunction2)
                .forEach(printConsumer2);
    }
}
