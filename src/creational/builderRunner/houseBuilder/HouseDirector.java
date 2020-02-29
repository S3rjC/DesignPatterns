package creational.builderRunner.houseBuilder;

import creational.builderRunner.houseBuilder.builders.HouseBuilder;
import creational.builderRunner.houseBuilder.components.*;

/**
 * @author Serghei Cibotarica
 */
public class HouseDirector {
    public void buildSimpleHouse(HouseBuilder builder) {
        builder.buildWalls(new Walls(4, Material.STONE));
        builder.buildDoors(new Doors(3, Material.WOOD));
        builder.buildWindows(4);
        builder.buildRoof(new Roof(RoofType.GABLE, Material.METAL));
    }

    public void buildHouseWithGarden(HouseBuilder builder) {
        builder.buildWalls(new Walls(4, Material.WOOD));
        builder.buildDoors(new Doors(3, Material.WOOD));
        builder.buildWindows(3);
        builder.buildRoof(new Roof(RoofType.PYRAMID, Material.METAL));
        builder.buildGarden(new Garden(200));
    }

    public void buildHouseWithGarage(HouseBuilder builder) {
        builder.buildWalls(new Walls(4, Material.STONE));
        builder.buildDoors(new Doors(3, Material.METAL));
        builder.buildWindows(4);
        builder.buildRoof(new Roof(RoofType.SHED, Material.METAL));
        builder.buildGarage(new Garage(100, GarageType.SLIDING_DOOR));
    }
}
