package creational.builderRunner.builder.builders;

import creational.builderRunner.builder.components.Engine;
import creational.builderRunner.builder.components.GPSNavigator;
import creational.builderRunner.builder.components.Transmission;
import creational.builderRunner.builder.components.TripComputer;
import creational.builderRunner.builder.products.CarManual;
import creational.builderRunner.builder.products.Type;

/**
 * @author Serj C.
 */
public class CarManualBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public CarManual getResult() {
        return new CarManual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
