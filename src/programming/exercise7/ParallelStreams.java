package programming.exercise7;

import java.util.stream.LongStream;

public class ParallelStreams {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        LongStream.rangeClosed(1, 100000000).sum(); // 179 milliseconds
        LongStream.rangeClosed(1, 100000000).parallel().sum(); // 70 milliseconds
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
