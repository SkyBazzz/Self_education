package patterns.delegate;

public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Paint Circle");
    }
}
