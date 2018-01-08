package patterns.creational_design_patterns.builder.preparation_data.builder;

import patterns.creational_design_patterns.builder.preparation_data.car.Transmission;

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
