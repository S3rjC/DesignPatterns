package creational.builderPattern.houseBuilder.components;

/**
 * @author Serghei Cibotarica
 */
public class Garden {
    private final double area;

    public Garden(final double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
