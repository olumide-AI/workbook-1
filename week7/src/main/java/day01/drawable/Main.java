package day01.drawable;

public class Main {
    public static void main(String[] args) {
        Drawable shape1 = ShapeFactory.getShape("circle");
        Drawable shape2 = ShapeFactory.getShape("square");

        if (shape1 != null) shape1.draw();
        if (shape2 != null) shape2.draw();
    }
}
