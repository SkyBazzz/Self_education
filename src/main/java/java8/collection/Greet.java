package java8.collection;

public class Greet {
    public void greet(Greeting greeting) {
        System.out.println(greeting.perform("message"));
    }

    public static void main(String[] args) {
        Greet greeter = new Greet();
        Greeting hello = s -> s + " alarm";

        greeter.greet(hello);
        Thread thread = new Thread(() -> System.out.println("Hello thread"));
        thread.start();

    }
}