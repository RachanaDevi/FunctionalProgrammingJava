package programming;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {
        printAllNumbersInStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
