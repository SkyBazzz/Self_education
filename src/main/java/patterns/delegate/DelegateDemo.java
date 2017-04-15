package patterns.delegate;

import patterns.delegate.delegatePrinter.Painter;
import patterns.delegate.delegators.Circle;
import patterns.delegate.delegators.Square;
import patterns.delegate.delegators.Triangle;

/**
 * Реализован паттерн делигат *
 */
public class DelegateDemo {
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setGraphics(new Triangle());
        painter.draw();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Circle());
        painter.draw();
    }
}
