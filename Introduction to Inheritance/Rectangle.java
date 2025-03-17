public class Rectangle extends Quadrilateral{
    private Boolean isSquare = false;
    private int s1; private int s2;

    public Rectangle(int s1, int s2) {
        super(s1, s2, s1, s2);
        this.s1 = s1; this.s2 = s2;
        if (s1 == s2) {
            isSquare = true;
        }
    }

    public Boolean getIsSquare() {
        return isSquare;
    }

    public int getArea() {
        return s1 * s2;
    }
}
