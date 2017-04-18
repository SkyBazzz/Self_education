package patterns.delegate.preparation_data.delegators;

public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Paint Circle");
    }
}
