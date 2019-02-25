import java.util.HashMap;
import java.util.Map;

public final class ShapesFactory {
    private static Map<String, Shape> registry = new HashMap<String, Shape>();
    public static void registerShape(String name, Shape s){
        registry.put(name, s);
    }
    public Shape createShape(String name) {
        return registry.get(name).createShape();
    }
}
