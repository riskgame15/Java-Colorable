public class Test {
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(5);
        list[1] = new Rectangle(5, 10);
        list[2] = new Square(7);
        for (Shape shape : list) {
            System.out.println("Area of the shape: " );
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}