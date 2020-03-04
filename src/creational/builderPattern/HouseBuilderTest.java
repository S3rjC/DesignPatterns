package creational.builderPattern;

import creational.builderPattern.houseBuilder.HouseDirector;
import creational.builderPattern.houseBuilder.builders.HouseWithGarageBuilder;
import creational.builderPattern.houseBuilder.builders.HouseWithGardenBuilder;
import creational.builderPattern.houseBuilder.products.HouseWithGarage;
import creational.builderPattern.houseBuilder.products.HouseWithGarden;

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
public class HouseBuilderTest {
    public static void main(String[] args) {
        HouseDirector director = new HouseDirector();

        HouseWithGarageBuilder houseWithGarageBuilder = new HouseWithGarageBuilder();
        HouseWithGardenBuilder houseWithGardenBuilder = new HouseWithGardenBuilder();

        director.buildSimpleHouse(houseWithGarageBuilder);
        HouseWithGarage simpleHouse1 = houseWithGarageBuilder.getBuiltHouse();
        if (simpleHouse1.getGarage() == null) {
            System.out.println("1. Simple house with no garage");
        }

        director.buildSimpleHouse(houseWithGardenBuilder);
        HouseWithGarden simpleHouse2 = houseWithGardenBuilder.getBuiltHouse();
        if (simpleHouse2.getGarden() == null) {
            System.out.println("2. Simple house with no garden");
        }

        director.buildHouseWithGarage(houseWithGarageBuilder);
        HouseWithGarage houseWithGarage = houseWithGarageBuilder.getBuiltHouse();
        System.out.println("3. House with garage -> walls no.: "
                + houseWithGarage.getWalls().getWallsNumber()
                + ", material: " + houseWithGarage.getWalls().getMaterial()
                + "\n\tdoors no.: " + houseWithGarage.getDoors().getDoorsNumber()
                + ", material: " + houseWithGarage.getDoors().getMaterial()
                + "\n\twindows no.: " + houseWithGarage.getWindows()
                + "\n\troof type: " + houseWithGarage.getRoof().getRoofType()
                + ", material: " + houseWithGarage.getRoof().getMaterial()
                + "\n\tgarage area: " + houseWithGarage.getGarage().getArea()
                + ", garage type: " + houseWithGarage.getGarage().getGarageType());

        director.buildHouseWithGarden(houseWithGardenBuilder);
        HouseWithGarden houseWithGarden = houseWithGardenBuilder.getBuiltHouse();
        System.out.println("4. House with garden -> walls no.: "
                + houseWithGarden.getWalls().getWallsNumber()
                + ", material: " + houseWithGarden.getWalls().getMaterial()
                + "\n\tdoors no.: " + houseWithGarden.getDoors().getDoorsNumber()
                + ", material: " + houseWithGarden.getDoors().getMaterial()
                + "\n\twindows no.: " + houseWithGarden.getWindows()
                + "\n\troof type: " + houseWithGarden.getRoof().getRoofType()
                + ", material: " + houseWithGarden.getRoof().getMaterial()
                +"\n\tgarden area: " + houseWithGarden.getGarden().getArea());
    }
}
