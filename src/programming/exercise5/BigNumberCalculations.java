package programming.exercise5;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BigNumberCalculations {

    public static void main(String[] args) {
        // this comes up as 0 because the number reduced is too huge
        System.out.println(IntStream.rangeClosed(1, 50).reduce(1, (a, b) -> a * b));

        // this comes up as negative value for LongStream
        System.out.println(LongStream.rangeClosed(1, 50).reduce(1, (a, b) -> a * b));

        // to do huge operations then you can mapToObj to BigInteger
        System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
    }
}
