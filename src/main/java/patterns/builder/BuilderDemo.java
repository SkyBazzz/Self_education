package patterns.builder;

import patterns.builder.builder.SubaruBuilder;
import patterns.builder.car.Car;
import patterns.builder.director.Director;

public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruBuilder());
        Car car = director.buildCar();
        System.out.println(car);

    }
}
