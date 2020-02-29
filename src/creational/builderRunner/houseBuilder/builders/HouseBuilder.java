package creational.builderRunner.houseBuilder.builders;

import creational.builderRunner.houseBuilder.components.*;

/**
 * @author Serj C.
 */
public interface HouseBuilder {
    void buildWalls(Walls walls);
    void buildDoors(Doors doors);
    void buildWindows(int windows);
    void buildRoof(Roof roof);
    void buildGarage(Garage garage);
    void buildGarden(Garden garden);
}
