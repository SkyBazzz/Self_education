package patterns.composite;

import patterns.composite.preparation_data.*;

public class CompositeDemo {

    public static void main(String[] args) {
        Shape suqare1 = new Square();
        Shape suqare2 = new Square();
        Shape triangle1 = new Triangle();

        Shape square3 = new Square();
        Shape square2 = new Square();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(suqare1);
        composite1.addComponent(suqare2);
        composite1.addComponent(triangle1);

        composite2.addComponent(square3);
        composite2.addComponent(square2);
        composite2.addComponent(circle1);
        composite2.addComponent(circle2);

        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.draw();
        System.out.println("----------");
        composite1.draw();
        System.out.println("----------");
        composite2.draw();
    }
}
