package structural.flyweight;

import java.awt.*;

/**
 * The Tree class represents a tree object with coordinates and a specific type, capable of being drawn
 * on a graphics object.
**/
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}