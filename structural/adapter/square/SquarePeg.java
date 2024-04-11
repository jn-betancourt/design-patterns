package structural.adapter.square;

/**
 * The `SquarePeg` class represents a square peg with a specified width and provides methods to get the
 * width and calculate the area of the square.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
