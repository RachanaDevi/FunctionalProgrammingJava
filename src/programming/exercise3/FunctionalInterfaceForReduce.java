package programming.exercise3;

import java.util.function.BinaryOperator;

import static programming.common.Inputs.numbers;

public class FunctionalInterfaceForReduce {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = Integer::sum;
        // BinaryOperator is BiFunction which takes 2 arguments and returns a single argument
        // The difference between BinaryOperator and BiFunction is that BinaryOperator has the same argument type
        BinaryOperator<Integer> sum2 = new BinaryOperator<Integer>() {
            // the abstract method present is known as function descriptor like apply, test, accept.
            @Override
            public Integer apply(Integer number1, Integer number2) {
                return number1 + number2;
            }
        };

        System.out.println(numbers.stream().reduce(sum2));

    }
}
