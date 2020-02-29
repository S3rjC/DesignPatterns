package creational.builderRunner.houseBuilder.components;

/**
 * @author Serghei Cibotarica
 */
public class Doors {
    private final int doorsNumber;
    private final Material material;

    public Doors(final int doorsNumber, final Material material) {
        this.doorsNumber = doorsNumber;
        this.material = material;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public Material getMaterial() {
        return material;
    }
}
