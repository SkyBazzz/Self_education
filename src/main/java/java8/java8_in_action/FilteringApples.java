package java8.java8_in_action;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {

    public static final Predicate<Apple> HEAVY_APPLE = a1 -> a1.getWeight() > 140;
    public static final Predicate<Apple> GREEN_APPLE = a1 -> "green".equals(a1.getColor());

    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                                              new Apple(155, "green"),
                                              new Apple(120, "red"),
                                              new Apple(120, "yellow"),
                                              new Apple(155, "blue"));

        // System.out.println(filter(inventory, apple -> "green".equals(apple.getColor())));
        //
        // List<Apple> heavyApples = inventory.parallelStream().filter(apple -> apple.getWeight() >
        // 150).collect(toList());
        // System.out.println(heavyApples);
        //
        // prettyPrintApple(inventory, new SimpleAppleFormatter());
        //
        // inventory.sort(comparing(Apple::getWeight));
        // System.out.println(inventory);
        //
        // List<String> str = Arrays.asList("a", "b", "A", "B");
        // str.sort(String::compareToIgnoreCase);
        // System.out.println(str);
        //
        // BiFunction<Integer, String, Apple> function = Apple::new;
        // Apple apple = function.apply(110, "red");
        // System.out.println(apple);

        Predicate<Apple> notGreenApple = GREEN_APPLE.negate();
        Predicate<Apple> greenAndheavyApple = GREEN_APPLE.and(HEAVY_APPLE);


        inventory.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColor));
        System.out.println(inventory);

        inventory.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);

    }


    private static <T> Collection<T> filter(Collection<T> inventory, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T element: inventory){
            if (p.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    private static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for(Apple apple: inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}