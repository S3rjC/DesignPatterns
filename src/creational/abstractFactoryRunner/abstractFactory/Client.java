package creational.abstractFactoryRunner.abstractFactory;

import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.FurnitureFactory;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.chair.Chair;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.coffeeTable.CoffeeTable;
import creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.sofa.Sofa;

/**
 * @author Serj C.
 */
public class Client {
    private Chair chair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;

    public Client(FurnitureFactory furnitureFactory) {
        chair = furnitureFactory.createChair();
        coffeeTable = furnitureFactory.createCoffeeTable();
        sofa = furnitureFactory.createSofa();
    }

    public void deliver() {
        chair.deliver();
        coffeeTable.deliver();
        sofa.deliver();
    }
}
