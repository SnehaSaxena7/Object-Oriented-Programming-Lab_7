import shapes.Circle;
import shapes.Rectangle;

public class ShapesDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        System.out.printf("Area of Circle (r=5)        = %.2f%n", c.area());
        System.out.printf("Area of Rectangle (4 x 6)   = %.2f%n", r.area());
    }
}
