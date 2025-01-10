public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + super.getWidth()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {

    }
}
