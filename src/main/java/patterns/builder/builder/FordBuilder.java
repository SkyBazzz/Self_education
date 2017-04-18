package patterns.builder.builder;

import patterns.builder.car.Transmission;

public class FordBuilder extends CarBuilder {
    @Override
    public void setModel() {
        car.setModel("Ford");
    }

    @Override
    public void setTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    public void setMaxSpeed() {
        car.setMaxSpeed(180);
    }
}
