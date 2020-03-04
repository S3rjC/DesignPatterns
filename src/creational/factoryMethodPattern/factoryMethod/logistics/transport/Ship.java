package creational.factoryMethodPattern.factoryMethod.logistics.transport;

/**
 * @author Serj C.
 */
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivered.");
    }
}
