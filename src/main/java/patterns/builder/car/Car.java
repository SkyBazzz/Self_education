package patterns.builder.car;

public class Car {
    private String model;
    private Transmission transmission;
    private int speed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return String.format("Car [ model  = %s, transmission = %s, speed = %d]", model, transmission, speed);
    }
}
