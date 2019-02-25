public class Square extends Shape {

    static {
        ShapesFactory.registerShape("Square",new Square());
    }

}