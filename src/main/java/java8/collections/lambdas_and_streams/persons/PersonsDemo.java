package java8.collections.lambdas_and_streams.persons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java8.collections.lambdas_and_streams.persons.Person.printPeople;

public class PersonsDemo {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));

        Comparator<Person> compareAscending = Person::ageDifference;
        Comparator<Person> compareDescending  = compareAscending.reversed();
        final Function<Person, String> byName = Person::getName;
        final Function<Person, Integer> byAge = Person::getAge;

        List<Person> ascendingAge = ascendingOrder(people, compareAscending);
        printPeople("Sorted in ascending order by age", ascendingAge);

        List<Person> descendingAge = ascendingOrder(people, compareDescending);
        printPeople("Sorted in descending order by age", descendingAge);

        youngest(people, compareAscending);

        multiSorting(people, byName, byAge);

        List<Person> olderThan20 = people.stream()
                                         .filter(person -> person.getAge() > 20)
                                         .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println("People older than 20: " + olderThan20);

        Map<Integer, List<Person>> peopleByAge = people.stream()
                                                       .collect(groupingBy(Person::getAge));
        System.out.println("Grouped by age: " + peopleByAge);

        Map<Integer, List<String>> nameOfPeopleByAge = people.stream()
                                                              .collect(groupingBy(Person::getAge, mapping(Person::getName, toList())));
        System.out.println("People grouped by age: " + nameOfPeopleByAge);
    }

    private static void youngest(List<Person> people, Comparator<Person> compareAscending) {
        people.stream()
              .min(compareAscending)
              .ifPresent(youngest -> System.out.println("Youngest: " + youngest));
    }

    private static void multiSorting(List<Person> people, Function<Person, String> byName, Function<Person, Integer> byAge) {
        people.stream()
              .sorted(comparing(byAge).thenComparing(byName));
    }

    private static List<Person> ascendingOrder(List<Person> people, Comparator<Person> compareAscending) {
        return people.stream()
                     .sorted(compareAscending)
                     .collect(toList());
    }
}
