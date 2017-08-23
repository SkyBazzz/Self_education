package java8.collections.lambdas_and_streams.delayed_initialization;

import java.util.function.Supplier;

public class Holder {
    private Supplier<Heavy> heavySupplier = () -> createAndCacheheavy();

    public Holder() {
        System.out.println("Holder created");
    }
    public Heavy getHeavy(){
        return heavySupplier.get();
    }

    private synchronized Heavy createAndCacheheavy() {
        class HeavyFactory implements Supplier<Heavy>{
            private final Heavy heavyInstance = new Heavy();

            @Override
            public Heavy get() {
                return heavyInstance;
            }
        }
        if(!HeavyFactory.class.isInstance(heavySupplier)){
            heavySupplier = new HeavyFactory();
        }
        return heavySupplier.get();
    }
}