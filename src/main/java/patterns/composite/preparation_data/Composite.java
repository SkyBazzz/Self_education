package patterns.composite.preparation_data;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape{
    public List<Shape> composites;

    public Composite() {
        this.composites = new ArrayList<>();
    }

    public void addComponent(Shape shape){
        composites.add(shape);
    }

    public void removeComponent(Shape shape){
        composites.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape component: composites
             ) {
           component.draw();
        }
    }
}
