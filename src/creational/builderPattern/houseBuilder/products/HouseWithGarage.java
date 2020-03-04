package creational.builderPattern.houseBuilder.products;

import creational.builderPattern.houseBuilder.components.*;

/**
 * @author Serghei Cibotarica
 */
public class HouseWithGarage {
    private final Walls walls;
    private final Doors doors;
    private final int windows;
    private final Roof roof;
    private final Garage garage;

    public HouseWithGarage(Walls walls, Doors doors, int windows, Roof roof, Garage garage) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
    }

    public Walls getWalls() {
        return walls;
    }

    public Doors getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public Roof getRoof() {
        return roof;
    }

    public Garage getGarage() {
        return garage;
    }
}
