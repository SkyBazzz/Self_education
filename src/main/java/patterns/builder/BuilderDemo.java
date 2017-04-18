package patterns.builder;

import patterns.builder.preparation_data.builder.FordBuilder;
import patterns.builder.preparation_data.builder.SubaruBuilder;
import patterns.builder.preparation_data.car.Car;
import patterns.builder.preparation_data.director.Director;

public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruBuilder());
        Car car1 = director.buildCar();
        System.out.println(car1);

        director.setBuilder(new FordBuilder());
        Car car2 = director.buildCar();
        System.out.println(car2);
    }
}
