package patterns.creational_design_patterns.builder.builders;

import patterns.creational_design_patterns.builder.cars.Type;
import patterns.creational_design_patterns.builder.components.Engine;
import patterns.creational_design_patterns.builder.components.GPSNavigator;
import patterns.creational_design_patterns.builder.components.Transmission;
import patterns.creational_design_patterns.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги
 * конфигурации продукта.
 */
public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
