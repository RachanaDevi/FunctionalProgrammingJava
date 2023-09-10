package programming.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsFromList {

    public static void main(String[] args) {
        // you can create stream using Stream.of()
        int[] array = {1, 2, 3, 4, 5, 6};
        var arrayList = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(Stream.of(array)); // ReferencePipeline
        System.out.println(Arrays.stream(array)); //IntPipeline ( optimized as it doesn't use wrapper class)
    }
}
