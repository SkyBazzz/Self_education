package patterns.delegate.delegators;

public class Square implements Graphics {
    @Override
    public void draw() {
        System.out.println("Paint Square");
    }
}
