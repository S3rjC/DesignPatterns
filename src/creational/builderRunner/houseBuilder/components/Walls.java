package creational.builderRunner.houseBuilder.components;

/**
 * @author Serghei Cibotarica
 */
public class Walls {
    private final int wallsNumber;
    private final Material material;

    public Walls(int wallsNumber, Material material) {
        this.wallsNumber = wallsNumber;
        this.material = material;
    }

    public int getWallsNumber() {
        return wallsNumber;
    }

    public Material getMaterial() {
        return material;
    }
}
