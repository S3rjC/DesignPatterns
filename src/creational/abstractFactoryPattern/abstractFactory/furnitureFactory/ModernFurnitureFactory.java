package creational.abstractFactoryPattern.abstractFactory.furnitureFactory;

import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.chair.Chair;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.chair.ModernChair;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.coffeeTable.CoffeeTable;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.coffeeTable.ModernCoffeeTable;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.sofa.ModernSofa;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.sofa.Sofa;

/**
 * @author Serj C.
 */
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
