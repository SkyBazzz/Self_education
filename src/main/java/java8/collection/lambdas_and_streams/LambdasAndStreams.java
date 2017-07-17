package java8.collection.lambdas_and_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdasAndStreams {
    public static void main(String[] args) throws InterruptedException {
        /*
        function has 4 things
        1. name
            2. parameter list
            3. body
        4. return type
         */
        Thread tr = new Thread(() ->
                System.out.println("In another thread"));

        tr.start();
        System.out.println("In main");
        tr.join();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // internal iterator
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });
        System.out.println("Using method reference");
        //parenthesis is optional for single parameter
        numbers.forEach(System.out::println);

        System.out.println(". Map");

        numbers.stream()
                .map(String::valueOf)
                .forEach(System.out::print);
        //reduce
        System.out.println();
        System.out.println(
                numbers
                        .stream()
                        .reduce(0, Integer::sum));
        System.out.println(
                numbers
                        .stream()
                        .map(String::valueOf)
                        .reduce("", String::concat));
        //spaghetti code
        int result = 0;
        for (int e : numbers
                ) {
            if (e % 2 == 0) {
                result += e * 2;
            }
        }
        System.out.println(result);
        //no spaghetti code
        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum());

        numbers
                .stream()
                .filter(e -> e % 2 != 0)
                .filter(e -> e % 3 != 0)
                .map(e -> e * 2)
                .forEach(System.out::println);

    }
}
