package creational.abstractFactoryRunner.abstractFactory.furnitureFactory;

import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.chair.Chair;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.chair.ModernChair;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.coffeeTable.CoffeeTable;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.coffeeTable.ModernCoffeeTable;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.sofa.ModernSofa;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.sofa.Sofa;

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
