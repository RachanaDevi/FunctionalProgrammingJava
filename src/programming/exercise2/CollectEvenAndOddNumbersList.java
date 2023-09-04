package programming.exercise2;

import java.util.List;
import java.util.stream.Collectors;

import static programming.common.Inputs.numbers;

public class CollectEvenAndOddNumbersList {

    public static void main(String[] args) {
        System.out.println(evenNumbers(numbers));
        System.out.println(oddNumbers(numbers));
    }

    private static List<Integer> evenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
    }

    private static List<Integer> oddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
    }
}
