package structural.adapterPattern.square;

/**
 * @author Serj C.
 *
 * SquarePegs are not compatible with RoundHoles (they were implemented by previous development team), but we have to
 * integrate them into our program.
 */
public class SquarePeg {
    private double side;

    public SquarePeg() {
    }

    public SquarePeg(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
