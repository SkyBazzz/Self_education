package java8.java8_in_action;


import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                                              new Apple(155, "green"),
                                              new Apple(120 , "red"));

        System.out.println(filter(inventory, apple -> "green".equals(apple.getColor())));

        List<Apple> heavyApples = inventory.parallelStream().filter(apple -> apple.getWeight() > 150).collect(toList());
        System.out.println(heavyApples);
        prettyPrintApple(inventory, new SimpleAppleFormatter());

    }
    public static class Apple{
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public static boolean isGreenApple(Apple apple) {
            return "green".equals(apple.getColor());
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static <T> Collection<T> filter(Collection<T> inventory, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for (T element: inventory){
            if (p.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for(Apple apple: inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}