package creational.factoryMethodRunner.factoryMethod.logistics;

import creational.factoryMethodRunner.factoryMethod.logistics.transport.Ship;
import creational.factoryMethodRunner.factoryMethod.logistics.transport.Transport;

/**
 * @author Serj C.
 */
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
