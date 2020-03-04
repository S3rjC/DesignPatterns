package creational.factoryMethodPattern.factoryMethod.logistics;

import creational.factoryMethodPattern.factoryMethod.logistics.transport.Transport;
import creational.factoryMethodPattern.factoryMethod.logistics.transport.Truck;

/**
 * @author Serj C.
 */
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
