package java8.collections.lambdas_and_streams.delayed_initialization;

public class LazyDemo {
    public static void main(String[] args) {
        final HolderNaive holderNaive = new HolderNaive();
        System.out.println("deferring heavy creation...");
        System.out.println(holderNaive.getHeavy());
        System.out.println(holderNaive.getHeavy());
    }
}
