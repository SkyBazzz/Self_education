package patterns.builder.director;

import patterns.builder.builder.CarBuilder;
import patterns.builder.car.Car;

public class Director {
    CarBuilder carBuilder;

    public void setBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar() {
        carBuilder.createCar();
        carBuilder.setModel();
        carBuilder.setTransmission();
        carBuilder.setMaxSpeed();
        Car car = carBuilder.getCar();

        return car;
    }
}
