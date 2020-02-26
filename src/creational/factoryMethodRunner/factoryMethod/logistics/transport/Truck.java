package creational.factoryMethodRunner.factoryMethod.logistics.transport;

/**
 * @author Serj C.
 */
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck delivered.");
    }
}
