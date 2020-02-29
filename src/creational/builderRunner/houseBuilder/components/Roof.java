package creational.builderRunner.houseBuilder.components;

/**
 * @author Serghei Cibotarica
 */
public class Roof {
    private final RoofType roofType;
    private final Material material;

    public Roof(RoofType roofType, Material material) {
        this.roofType = roofType;
        this.material = material;
    }

    public RoofType getRoofType() {
        return roofType;
    }

    public Material getMaterial() {
        return material;
    }
}
