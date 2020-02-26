package creational.abstractFactoryRunner.abstractFactory.furnitureFactory.furniture.coffeeTable;

/**
 * @author Serj C.
 */
public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void deliver() {
        System.out.println("Modern Coffee Table delivered.");
    }
}
