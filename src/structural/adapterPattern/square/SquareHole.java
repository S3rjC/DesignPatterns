package structural.adapterPattern.square;

import structural.adapterPattern.adapters.RoundPegAdapter;

/**
 * @author Serj C.
 *
 * SquareHoles are compatible with SquarePegs.
 */
public class SquareHole {
    private double side;

    public SquareHole(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public boolean fits(SquarePeg peg) {
        return this.getSide() >= peg.getSide();
    }
}
