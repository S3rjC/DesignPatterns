package structural.adapterPattern.adapters;

import structural.adapterPattern.round.RoundPeg;
import structural.adapterPattern.square.SquarePeg;

/**
 * @author Serj C.
 *
 * Adapter allows fitting square pegs into RoundHoles.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = peg.getSide() * Math.sqrt(2) / 2;
        return result;
    }
}
