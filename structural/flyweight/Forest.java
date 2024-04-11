package structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The `Forest` class in Java represents a forest with trees that can be planted at specific
 * coordinates and drawn on a graphics object.
 */
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    /**
     * The `plantTree` function creates a new tree object with the specified parameters and adds it to
     * a list of trees.
     * 
     * @param x The parameter `x` represents the x-coordinate where the tree will be planted on a
     * coordinate system.
     * @param y The parameter `y` in the `plantTree` method represents the y-coordinate where the tree
     * will be planted on a 2D coordinate system.
     * @param name The `name` parameter in the `plantTree` method represents the name or type of the
     * tree that is being planted.
     * @param color Color is a class in Java that represents a color. It can be used to set the color
     * of various graphical elements such as shapes, text, etc. You can create a Color object by
     * specifying the RGB values or by using predefined color constants like Color.RED, Color.BLUE,
     * etc.
     * @param otherTreeData The `otherTreeData` parameter in the `plantTree` method is a string that
     * contains additional data specific to the tree being planted. This data could include information
     * such as the tree's age, height, species, or any other relevant details that are not covered by
     * the `name` and `
     */
    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }
    
    /**
     * The `paint` method overrides the default behavior to draw each tree in the list of trees using
     * the provided `Graphics` object.
     * 
     * @param graphics The `Graphics` parameter in the `paint` method is used to draw graphics on the
     * screen. It provides methods for drawing shapes, text, and images on a component. In the code
     * snippet you provided, the `paint` method is iterating over a list of `Tree` objects and calling
     * the
     */
    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
