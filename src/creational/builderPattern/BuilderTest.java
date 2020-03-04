package creational.builderPattern;

import creational.builderPattern.builder.Director;
import creational.builderPattern.builder.builders.CarBuilder;
import creational.builderPattern.builder.builders.CarManualBuilder;
import creational.builderPattern.builder.products.Car;
import creational.builderPattern.builder.products.CarManual;

/**
 * @author Serj C.
 *
 * BUILDER
 * -------
 * 1. The Builder interface declares product construction steps that are common to all types of builders.
 * 2. Concrete Builders provide different implementations of the construction steps. Concrete builders
 * may produce products that don’t follow the common interface.
 * 3. Products are resulting objects. Products constructed by different builders don’t have to belong
 * to the same class hierarchy or interface.
 * 4. The Director class defines the order in which to call construction steps, so you can create and
 * reuse specific configurations of products.
 * 5. The Client must associate one of the builder objects with the director. Usually, it’s done just once,
 * via parameters of the director’s constructor. Then the director uses that builder object for all further
 * construction. However, there’s an alternative approach for when the client passes the builder object to
 * the production method of the director. In this case, you can use a different builder each time you produce
 * something with the director.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built: \n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        CarManual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built: \n" + carManual.print());
    }
}
