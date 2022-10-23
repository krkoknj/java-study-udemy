package inherit;

public class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2, 10, 20);
        System.out.println("rectangle.getWidth() = " + rectangle.getWidth());
        System.out.println("rectangle.getHeight() = " + rectangle.getHeight());
        System.out.println("rectangle.getX() = " + rectangle.getX());
        System.out.println("rectangle.getY() = " + rectangle.getY());
        Shape shape1 = new Rectangle(2, 3, 100, 200);
        System.out.println("shape1.getX() = " + shape1.getX());
        System.out.println("shape1.getX() = " + shape1.getX());
        System.out.println("shape1.getWidth() = " + shape1.getWidth());
        System.out.println("shape1.getHeight() = " + shape1.getHeight());
        Shape shape2 = rectangle;
        shape2 = shape1;
        System.out.println("shape2.getHeight() = " + shape2.getHeight());
    }
}
