package creational.builderPattern.houseBuilder.components;

/**
 * @author Serj C.
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
