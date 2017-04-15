package patterns.delegate.delegators;

public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Paint Circle");
    }
}
