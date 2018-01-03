package java8.collections;

@FunctionalInterface
public interface Greeting {
    String perform(String message);
    default void getName(){
            System.out.println("Sasha");
    }
}
