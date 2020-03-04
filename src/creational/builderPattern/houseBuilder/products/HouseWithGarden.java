package creational.builderPattern.houseBuilder.products;

import creational.builderPattern.houseBuilder.components.*;

/**
 * @author Serghei Cibotarica
 */
public class HouseWithGarden {
    private final Walls walls;
    private final Doors doors;
    private final int windows;
    private final Roof roof;
    private final Garden garden;

    public HouseWithGarden(Walls walls, Doors doors, int windows, Roof roof, Garden garden) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garden = garden;
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

    public Garden getGarden() {
        return garden;
    }
}
