package patterns.decorator.preparation_data;

/**
 * The type Red shape decorator.
 */
public class RedShapeDecorator extends ShapeDecorator {

    /**
     * Instantiates a new Red shape decorator
     * by adding a wrapped shape as parameter.
     * That's how we decorate it.
     *
     * @param shapeDecorator the shape decorator
     */
    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(shapeDecorator);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println(String.format("Border Color: Red %s", decoratedShape));
    }
}
