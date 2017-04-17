package patterns.builder.builder;

import patterns.builder.car.Transmission;

public class SubaruBuilder extends CarBuilder{
    @Override
    public void setModel() {
        car.setModel("Subaru");
    }

    @Override
    public void setTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    public void setMaxSpeed() {
        car.setMaxSpeed(150);
    }
}
