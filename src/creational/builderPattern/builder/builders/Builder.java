package creational.builderPattern.builder.builders;

import creational.builderPattern.builder.components.Engine;
import creational.builderPattern.builder.components.GPSNavigator;
import creational.builderPattern.builder.components.Transmission;
import creational.builderPattern.builder.components.TripComputer;
import creational.builderPattern.builder.products.Type;

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
