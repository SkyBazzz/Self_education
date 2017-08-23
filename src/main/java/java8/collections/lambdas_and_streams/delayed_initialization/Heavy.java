package java8.collections.lambdas_and_streams.delayed_initialization;

import java.util.stream.IntStream;

public class Heavy {
    public Heavy() {
        System.out.println("Heavy created");
    }

    @Override
    public String toString() {
        return "quite heavy";
    }

    public static boolean isPrime(final int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(divisor -> number % divisor == 0);
    }

}
