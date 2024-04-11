package structural.flyweight;
    
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * The `TreeFactory` class in Java is a factory class that creates and manages instances of `TreeType`
 * objects based on the provided name, color, and other tree data.
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    // The `public static TreeType getTreeType(String name, Color color, String otherTreeData)` method
    // in the `TreeFactory` class is a factory method that retrieves or creates a `TreeType` object
    // based on the provided name, color, and other tree data.
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
