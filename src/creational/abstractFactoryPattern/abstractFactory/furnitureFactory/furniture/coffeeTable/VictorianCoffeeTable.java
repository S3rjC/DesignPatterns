package creational.abstractFactoryPattern.abstractFactory.furnitureFactory.furniture.coffeeTable;

/**
 * @author Serj C.
 */
public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void deliver() {
        System.out.println("Victorian Coffee Table delivered.");
    }
}
