package structural.adapterPattern.adapters;

import structural.adapterPattern.round.RoundPeg;
import structural.adapterPattern.square.SquarePeg;

/**
 * @author Serj C.
 */
public class RoundPegAdapter extends SquarePeg {
    private RoundPeg peg;

    public RoundPegAdapter(RoundPeg peg) {
        this.peg = peg;
    }

    public double getSide() {
        return peg.getRadius() * 2;
    }
}
