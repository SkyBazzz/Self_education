package patterns.creational_design_patterns.builder.director;

import patterns.creational_design_patterns.builder.builders.Builder;
import patterns.creational_design_patterns.builder.cars.Type;
import patterns.creational_design_patterns.builder.components.Engine;
import patterns.creational_design_patterns.builder.components.GPSNavigator;
import patterns.creational_design_patterns.builder.components.Transmission;
import patterns.creational_design_patterns.builder.components.TripComputer;

/**
 * Директор знает в какой последовательности заставлять работать строителя. Он
 * работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
