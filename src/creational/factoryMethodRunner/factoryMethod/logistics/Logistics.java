package creational.factoryMethodRunner.factoryMethod.logistics;

import creational.factoryMethodRunner.factoryMethod.logistics.transport.Transport;

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
