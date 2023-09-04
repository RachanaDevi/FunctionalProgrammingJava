package programming.exercise2;

import java.util.List;

public class FP02HandsOn {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListStructured(numbers);
        int sumFunctional = addListFunctionalWay(numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Sum Functional: " + sumFunctional);
    }

    private static int addListFunctionalWay(List<Integer> numbers) {
        return numbers.stream()
                // Stream of number -> give one result
                // initial value / identity value is 0
                // accumulation function
                .reduce(0, FP02HandsOn::sum);
        // reduction operations parallelize
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int addListStructured(List<Integer> numbers) {
        // how to loop
        // how to store sum
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
