package patterns.builder.preparation_data.builder;

import patterns.builder.preparation_data.car.Car;

public abstract class CarBuilder {
    Car car;

    public void createCar() {
        this.car = new Car();
    }

    public abstract void setModel();

    public abstract void setTransmission();

    public abstract void setMaxSpeed();

    public Car getCar() {
        return car;
    }
}
