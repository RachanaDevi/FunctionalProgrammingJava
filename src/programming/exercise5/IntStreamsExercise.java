package programming.exercise5;

import java.util.stream.IntStream;

public class IntStreamsExercise {

    public static void main(String[] args) {

        IntStream intStreamRange = IntStream.range(1, 10); // this will not have 10 only till 9
        System.out.println(intStreamRange.sum()); // this is IntPipeline


        IntStream intStreamClosedRange = IntStream.rangeClosed(1, 10);
        System.out.println(intStreamClosedRange.sum());


        // this an infinite stream so you will have to limit it
        IntStream.iterate(1, e -> e + 2).peek(System.out::println).sum();

        // limit it
        IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum();
    }
}
