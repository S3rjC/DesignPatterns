package creational.abstractFactoryPattern;

import creational.abstractFactoryPattern.abstractFactory.Client;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.FurnitureFactory;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.ModernFurnitureFactory;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.VictorianFurnitureFactory;

/**
 * @author Serj C.
 *
 * ABSTRACT FACTORY
 * ----------------
 * 1. Abstract Products declare interfaces for a set of distinct but related products which make up a product family.
 * 2. Concrete Products are various implementations of abstract products, grouped by variants.
 * Each abstract product (chair/sofa) must be implemented in all given variants (Victorian/Modern).
 * 3. The Abstract Factory interface declares a set of methods for creating each of the abstract products.
 * 4. Concrete Factories implement creation methods of the abstract factory.
 * Each concrete factory corresponds to a specific variant of products and creates only those product variants.
 * 5. Although concrete factories instantiate concrete products, signatures of their creation methods must return
 * corresponding abstract products. This way the client code that uses a factory doesn’t get coupled to the
 * specific variant of the product it gets from a factory. The Client can work with any concrete factory/product
 * variant, as long as it communicates with their objects via abstract interfaces.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Client client;
        FurnitureFactory factory;

        factory = new VictorianFurnitureFactory();
        client = new Client(factory);
        client.deliver();
        System.out.println();

        factory = new ModernFurnitureFactory();
        client = new Client(factory);
        client.deliver();
    }
}
