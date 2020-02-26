package creational.factoryMethodRunner.factoryMethod.logistics;

import creational.factoryMethodRunner.factoryMethod.logistics.transport.Transport;
import creational.factoryMethodRunner.factoryMethod.logistics.transport.Truck;

/**
 * @author Serj C.
 */
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
