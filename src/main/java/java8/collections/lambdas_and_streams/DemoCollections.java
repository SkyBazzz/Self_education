package java8.collections.lambdas_and_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.joining;

public class DemoCollections {

    private static final String N = "N";
    private static final String STRING_LINE = "w00t";


    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
        final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

        final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);

        System.out.println(friends.stream().filter(startsWithLetter.apply(N)).count());
        System.out.println(editors.stream().filter(checkIfStartsWith(N)).count());
        System.out.println(comrades.stream().filter(checkIfStartsWith(N)).count());

        pickName(friends, N);
        pickName(editors, N);
        pickName(comrades, N);

        System.out
                .println("total number of characters in all names:" + friends.stream().mapToInt(String::length).sum());

        final Optional<String> aLongName = friends.stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));

        final String steveOrLonger = friends.stream().reduce("Steve",
                (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        System.out.println(steveOrLonger);

        printListVersionOne(friends);
        printListVersionTwo(friends);
        chars(STRING_LINE);

    }

    private static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }

    private static void pickName(final List<String> names, final String startingLetter) {
        final Optional<String> foundName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
        System.out.println(
                String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No name found")));
    }

    private static void printListVersionOne(List<String> list){
        System.out.println(String.join(", ", list));
    }

    private static void printListVersionTwo(List<String> list){
        System.out.println(list.stream()
                                .map(String::toUpperCase)
                                .collect(joining(", ")));
    }

    private static void chars(final String string){
        string.chars().forEach(System.out::println);
    }

}