package java8.java8_in_action;

public class SimpleAppleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return "weight: " + apple.getWeight() + "\n color: " + apple.getColor();
    }
}