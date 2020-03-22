package structural.adapterPattern;

import structural.adapterPattern.adapters.RoundPegAdapter;
import structural.adapterPattern.adapters.SquarePegAdapter;
import structural.adapterPattern.round.RoundHole;
import structural.adapterPattern.round.RoundPeg;
import structural.adapterPattern.square.SquareHole;
import structural.adapterPattern.square.SquarePeg;

/**
 * @author Serj C.
 *
 * ADAPTER
 * -------
 * 1. The Client is a class that contains the existing business logic of the program.
 * 2. The Client Interface describes a protocol that other classes must follow to be able to collaborate
 * with the client code.
 * 3. The Service is some useful class (usually 3rd-party or legacy). The client can’t use this class directly
 * because it has an incompatible interface.
 * 4. The Adapter is a class that’s able to work with both the client and the service: it implements the client
 * interface, while wrapping the service object. The adapter receives calls from the client via the adapter
 * interface and translates them into calls to the wrapped service object in a format it can understand.
 * 5. The client code doesn’t get coupled to the concrete adapter class as long as it works with the adapter via
 * the client interface. Thanks to this, you can introduce new types of adapters into the program without breaking
 * the existing client code. This can be useful when the interface of the service class gets changed or replaced:
 * you can just create a new adapter class without changing the client code.
 */
public class AdapterClient {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);
        //hole.fits(smallSquarePeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(largeSquarePegAdapter)) {
            System.out.println("Square peg w20 doesn't fit round hole r5.");
        }

        // Square fits square, no surprise.
        SquareHole squareHole = new SquareHole(10);
        SquarePeg squarePeg = new SquarePeg(10);
        if (squareHole.fits(squarePeg)) {
            System.out.println("\nSquare peg s10 fits square hole s10.");
        }

        // squareHole.fits(roundPeg); // Doesn't compile.

        // Adapter solves the problem.
        RoundPegAdapter roundPegAdapter = new RoundPegAdapter(roundPeg);

        RoundPeg bigRoundPeg = new RoundPeg(10);
        RoundPegAdapter bigRoundPegAdapter = new RoundPegAdapter(bigRoundPeg);

        if (squareHole.fits(roundPegAdapter)) {
            System.out.println("Round peg r5 fits square hole s10.");
        }
        if (!squareHole.fits(bigRoundPegAdapter)) {
            System.out.println("Round peg r10 doesn't fit square hole s10.");
        }
    }
}
