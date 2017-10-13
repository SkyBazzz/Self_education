package java8.java8_in_action;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilteringApples {

    public static final Predicate<Apple> HEAVY_APPLE = a1 -> a1.getWeight() > 140;
    public static final Predicate<Apple> GREEN_APPLE = a1 -> "green".equals(a1.getColor());
    public static final int INPUT_VALUE = 2;

    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                                              new Apple(155, "green"),
                                              new Apple(120, "red"),
                                              new Apple(120, "yellow"),
                                              new Apple(155, "blue"));
        //
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

        /*
         * Produces the negation of an existing predicate
         */
        Predicate<Apple> notGreenApple = GREEN_APPLE.negate();
        /*
         * Chaining Predicate's methods to construct a more complex predicate
         */
        Predicate<Apple> greenAndheavyApple = GREEN_APPLE.and(HEAVY_APPLE);
        /*
         * Sort by weight,sorting further when two apples have same weight
         */
        inventory.sort(comparing(Apple::getWeight).thenComparing(Apple::getColor));
        System.out.println(inventory);

        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);

        // Composing Functions
        /*
         * andThen() at first it applies f function after it g
         */
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g);
        int andThenResult = h.apply(INPUT_VALUE);
        System.out.println(String.format("Entering value is %d. The result of composing functions is %d", INPUT_VALUE,
                andThenResult));

        /*
         * andThen() at first it applies g function after it f
         */
        Function<Integer, Integer> k = f.compose(g);
        int composeResult = k.apply(INPUT_VALUE);
        System.out.println(String.format("Entering value is %d. The result of composing functions is %d", INPUT_VALUE,
                composeResult));

        // -----------------------Streams----------------------------
        List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                                        new Dish("beef", false, 700, Dish.Type.MEAT),
                                        new Dish("chicken", false, 400, Dish.Type.MEAT),
                                        new Dish("french fries", true, 530, Dish.Type.OTHER),
                                        new Dish("rice", true, 350, Dish.Type.OTHER),
                                        new Dish("season fruit", true, 120, Dish.Type.OTHER),
                                        new Dish("pizza", true, 550, Dish.Type.OTHER),
                                        new Dish("prawns", false, 300, Dish.Type.FISH),
                                        new Dish("salmon", false, 450, Dish.Type.FISH));

        List<String> threeHighCaloricDishNames = menu.stream().filter(d -> d.getCalories() > 300)
                                                              .map(Dish::getName)
                                                              .limit(3)
                                                              .collect(toList());
        System.out.println(threeHighCaloricDishNames);
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