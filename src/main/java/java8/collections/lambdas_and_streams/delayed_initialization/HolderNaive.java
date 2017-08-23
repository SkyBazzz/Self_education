package java8.collections.lambdas_and_streams.delayed_initialization;

public class HolderNaive {
    private Heavy heavy;

    public HolderNaive() {
        System.out.println("Holder created");
    }

    public synchronized Heavy getHeavy(){
        if(heavy == null){
            heavy = new Heavy();
        } 
        return heavy;
    }
}