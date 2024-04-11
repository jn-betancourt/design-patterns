package structural.adapter;

/**
 * The `SquarePegAdapter` class adapts a `SquarePeg` to be used as a `RoundPeg` by calculating the
 * minimum circle radius that can fit the square peg.
 */
import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
