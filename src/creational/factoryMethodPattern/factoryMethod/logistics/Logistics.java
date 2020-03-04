package creational.factoryMethodPattern.factoryMethod.logistics;

import creational.factoryMethodPattern.factoryMethod.logistics.transport.Transport;

/**
 * @author Serj C.
 */
public abstract class Logistics {
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }

    public abstract Transport createTransport();
}
