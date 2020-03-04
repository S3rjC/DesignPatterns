package creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.chair;

/**
 * @author Serj C.
 */
public class VictorianChair implements Chair {
    @Override
    public void deliver() {
        System.out.println("Victorian Chair delivered.");
    }
}
