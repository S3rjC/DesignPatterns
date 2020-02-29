package creational.builderRunner;

import creational.builderRunner.houseBuilder.HouseDirector;
import creational.builderRunner.houseBuilder.builders.HouseWithGarageBuilder;
import creational.builderRunner.houseBuilder.builders.HouseWithGardenBuilder;
import creational.builderRunner.houseBuilder.products.HouseWithGarage;
import creational.builderRunner.houseBuilder.products.HouseWithGarden;

/**
 * @author Serghei Cibotarica
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
