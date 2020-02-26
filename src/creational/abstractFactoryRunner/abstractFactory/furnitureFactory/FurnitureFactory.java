package creational.abstractFactoryRunner.abstractFactory.furnitureFactory;

import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.chair.Chair;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.coffeeTable.CoffeeTable;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.sofa.Sofa;

/**
 * @author Serj C.
 */
public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
