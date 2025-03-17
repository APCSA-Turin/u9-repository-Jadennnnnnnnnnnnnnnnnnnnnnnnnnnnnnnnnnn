public class Rhombus extends Quadrilateral{
    private int degree;
    private int side;

    public Rhombus(int degree, int side) {
        super(side, side, side, side);
        this.degree = degree;
        this.side = side;
    }

    public int getDegree() {
        return degree;
    }

    public double getArea() {
        return side * side * Math.sin(degree * Math.PI / 180);
    }
}
