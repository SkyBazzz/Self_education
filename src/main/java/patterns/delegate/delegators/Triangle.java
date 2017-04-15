package patterns.delegate.delegators;

public class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Paint Triangle");
    }
}
