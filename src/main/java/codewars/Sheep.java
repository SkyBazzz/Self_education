package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class Sheep {
    public static String countingSheep(int num) {
        //Add your code here
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
}
