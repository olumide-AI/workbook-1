package day01.drawable;

public class ShapeFactory {
    public static Drawable getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return null;  // or throw exception for unknown shape
        }
    }
}
