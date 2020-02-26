package creational.abstractFactoryRunner.abstractFactory.furnitureFactory;

import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.chair.Chair;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.chair.VictorianChair;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.coffeeTable.CoffeeTable;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.coffeeTable.VictorianCoffeeTable;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.sofa.Sofa;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.sofa.VictorianSofa;

/**
 * @author Serj C.
 */
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
