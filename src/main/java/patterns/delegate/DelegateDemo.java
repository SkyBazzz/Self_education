package patterns.delegate;

import patterns.delegate.preparation_data.delegate_printer.Painter;
import patterns.delegate.preparation_data.delegators.Circle;
import patterns.delegate.preparation_data.delegators.Square;
import patterns.delegate.preparation_data.delegators.Triangle;

/**
 * Реализован паттерн делигат
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
