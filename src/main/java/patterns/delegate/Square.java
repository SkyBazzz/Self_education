package patterns.delegate;

public class Square implements Graphics {
    @Override
    public void draw() {
        System.out.println("Paint Square");
    }
}
