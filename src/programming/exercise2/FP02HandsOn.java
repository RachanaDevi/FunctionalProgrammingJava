package programming.exercise2;

import java.util.List;

import static programming.common.Inputs.numbers;

public class FP02HandsOn {

    public static void main(String[] args) {


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
//                .reduce(0, FP02HandsOn::sum);
//                .reduce(0, (a, b) -> a + b);// lambda expression
                .reduce(0, Integer::sum);// Method reference
        // reduction operations parallelize
    }

    /*
    // so that's how it works internally
      aggregate, nextNumber
       0 + 12
       12 + 9
       21 + 13
       34 + 4
       38 + 6
       44 + 2
       46 + 4
       50 + 12
       62 + 15

     */
    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate + " + " + nextNumber);
        return aggregate + nextNumber;
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
