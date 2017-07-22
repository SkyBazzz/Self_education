package java8.collections.lambdas_and_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java8.collections.lambdas_and_streams.Person.createList;

public class LambdasAndStreams {
    public static void main(String[] args) throws InterruptedException {
        //Lambdas
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

        //internal iterator
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
        //Streams
        List<Integer> doubleOfEven = new ArrayList<>();

        numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .forEach(doubleOfEven::add);

        System.out.println(doubleOfEven); //don't do this.
        //Collect. avoid sharing mutability
        List<Integer> doubleOfEven2 = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(doubleOfEven2);

        List<Person> persons = createList();

        System.out.println(persons.get(1).getName());
        System.out.println(persons.get(1).getGender().gender);
        System.out.println(persons.get(1).getAge());

        System.out.println(
                persons.stream()
                        .collect(groupingBy(Person::getName,
                                mapping(Person::getAge, toList())))
        );

        System.out.println(
                numbers.stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 1)
                        .map(e -> e * 3)
                        .findFirst()
                        .get()
        );

    }
}
