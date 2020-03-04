package creational.factoryMethodPattern.factoryMethod.logistics;

import creational.factoryMethodPattern.factoryMethod.logistics.transport.Ship;
import creational.factoryMethodPattern.factoryMethod.logistics.transport.Transport;

/**
 * @author Serj C.
 */
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
