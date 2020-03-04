package creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.sofa;

/**
 * @author Serj C.
 */
public class ModernSofa implements Sofa {
    @Override
    public void deliver() {
        System.out.println("Modern Sofa delivered.");
    }
}
