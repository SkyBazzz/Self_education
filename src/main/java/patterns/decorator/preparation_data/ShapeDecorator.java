package patterns.decorator.preparation_data;

/**
 * The type Shape decorator.
 */
public abstract class ShapeDecorator implements Shape {
    /**
     * The Shape decorator.
     */
    protected Shape shapeDecorator;

    /**
     * Instantiates a new Shape decorator.
     *
     * @param shapeDecorator the shape decorator
     */
    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    /**
     * Drow.
     */
    public void drow() {
        shapeDecorator.draw();
    }
}
