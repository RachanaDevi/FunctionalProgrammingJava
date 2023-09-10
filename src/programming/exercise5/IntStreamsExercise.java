package programming.exercise5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamsExercise {

    public static void main(String[] args) {

        IntStream intStreamRange = IntStream.range(1, 10); // this will not have 10 only till 9
        System.out.println(intStreamRange.sum()); // this is IntPipeline


        IntStream intStreamClosedRange = IntStream.rangeClosed(1, 10);
        System.out.println(intStreamClosedRange.sum());


        // this an infinite stream so you will have to limit it
//        IntStream.iterate(1, number -> number + 2).peek(System.out::println).sum();

        // limit it
        IntStream.iterate(1, number -> number + 2).limit(10).peek(System.out::println).sum();

        // Use boxed for creating it toList()
        List<Integer> collectedBoxedIntStream = IntStream.iterate(1, number -> number + 2).limit(10).boxed().collect(Collectors.toList());
        System.out.println("List:" + collectedBoxedIntStream);
    }
}
