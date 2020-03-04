package creational.builderPattern.houseBuilder.components;

/**
 * @author Serj C.
 */
public class Garage {
    private final double area;
    private final GarageType garageType;

    public Garage(final double area, final GarageType garageType) {
        this.area = area;
        this.garageType = garageType;
    }

    public double getArea() {
        return area;
    }

    public GarageType getGarageType() {
        return garageType;
    }
}
