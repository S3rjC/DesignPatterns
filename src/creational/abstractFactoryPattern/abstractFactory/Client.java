package creational.abstractFactoryPattern.abstractFactory;

import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.FurnitureFactory;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.chair.Chair;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.coffeeTable.CoffeeTable;
import creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.sofa.Sofa;

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
