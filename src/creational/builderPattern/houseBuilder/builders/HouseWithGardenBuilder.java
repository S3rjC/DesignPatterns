package creational.builderPattern.houseBuilder.builders;

import creational.builderPattern.houseBuilder.components.*;
import creational.builderPattern.houseBuilder.products.HouseWithGarden;

/**
 * @author Serj C.
 */
public class HouseWithGardenBuilder implements HouseBuilder {
    private Walls walls;
    private Doors doors;
    private int windows;
    private Roof roof;
    private Garden garden;


    @Override
    public void buildWalls(Walls walls) {
        this.walls = walls;
    }

    @Override
    public void buildDoors(Doors doors) {
        this.doors = doors;
    }

    @Override
    public void buildWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void buildRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void buildGarage(Garage garage) {
        // This house has no garage
    }

    @Override
    public void buildGarden(Garden garden) {
        this.garden = garden;
    }

    public HouseWithGarden getBuiltHouse() {
        return new HouseWithGarden(walls, doors, windows, roof, garden);
    }
}
