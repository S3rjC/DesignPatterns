package creational.builderRunner.houseBuilder.builders;

import creational.builderRunner.houseBuilder.components.*;
import creational.builderRunner.houseBuilder.products.HouseWithGarage;

/**
 * @author Serj C.
 */
public class HouseWithGarageBuilder implements HouseBuilder {
    private Walls walls;
    private Doors doors;
    private int windows;
    private Roof roof;
    private Garage garage;

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
        this.garage = garage;
    }

    @Override
    public void buildGarden(Garden garden) {
        System.out.println("This house has no garden.");
    }

    public HouseWithGarage getBuiltHouse() {
        return new HouseWithGarage(walls, doors, windows, roof, garage);
    }
}
