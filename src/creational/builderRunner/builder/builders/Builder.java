package creational.builderRunner.builder.builders;

import creational.builderRunner.builder.components.Engine;
import creational.builderRunner.builder.components.GPSNavigator;
import creational.builderRunner.builder.components.Transmission;
import creational.builderRunner.builder.components.TripComputer;
import creational.builderRunner.builder.products.Type;

/**
 * @author Serj C.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
