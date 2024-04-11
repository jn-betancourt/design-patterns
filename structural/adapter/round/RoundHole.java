package structural.adapter.round;

/**
 * The `RoundHole` class represents a round hole with a specific radius and provides a method to check
 * if a `RoundPeg` object fits into the hole based on their respective radii.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
