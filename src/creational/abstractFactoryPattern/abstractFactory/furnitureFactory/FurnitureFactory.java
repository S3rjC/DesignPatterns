package creational.abstractFactoryPattern.abstractFactory.furnitureFactory;

import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.chair.Chair;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.coffeeTable.CoffeeTable;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.sofa.Sofa;

/**
 * @author Serj C.
 */
public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
