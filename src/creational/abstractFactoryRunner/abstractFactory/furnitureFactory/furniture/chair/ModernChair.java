package creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.chair;

/**
 * @author Serj C.
 */
public class ModernChair implements Chair {
    @Override
    public void deliver() {
        System.out.println("Modern Chair delivered.");
    }
}
