package java8.collection;

@FunctionalInterface
public interface Greeting {
    String perform(String message);
    default void getName(){
            System.out.println("Sasha");
    }
}
