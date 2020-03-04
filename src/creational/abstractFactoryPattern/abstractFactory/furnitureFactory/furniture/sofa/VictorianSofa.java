package creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.sofa;

/**
 * @author Serj C.
 */
public class VictorianSofa implements Sofa {
    @Override
    public void deliver() {
        System.out.println("Victorian Sofa delivered.");
    }
}
