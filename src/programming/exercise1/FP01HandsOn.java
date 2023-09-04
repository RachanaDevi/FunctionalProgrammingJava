package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.numbers;

public class FP01HandsOn {

    public static void main(String[] args) {
//        printAllNumbersInFunctionalWay(numbers);

//        printAllNumbersInStructured(numbers);
//        printAllEvenNumbersInStructured(numbers);
        printAllEvenNumbersInFunctionalWay(numbers);
    }

    private static void printAllNumbersInFunctionalWay(List<Integer> numbers) {
        // create a stream of numbers
        numbers.stream()
                // we don't want it to immediately execute, so we pass method reference
                .forEach(System.out::println); // Method reference
    }

    private static void printAllEvenNumbersInFunctionalWay(List<Integer> numbers) {
        // create a stream of numbers
        numbers.stream()
                // filter if the number is even or not
                .filter(number -> number % 2 == 0) // Use lambda expression
                // we don't want it to immediately execute, so we pass method reference
                .forEach(System.out::println); // Method reference
    }

    private static void printAllNumbersInStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    private static void printAllEvenNumbersInStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (isEven(number))
                System.out.println(number);
        }
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
