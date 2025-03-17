public class Quadrilateral {
    private int s1; private int s2; private int s3; private int s4;

    public Quadrilateral(int s1, int s2, int s3, int s4) {
        this.s1 = s1; this.s2 = s2; this.s3 = s3; this.s4 = s4;
    }

    public int getSide1() {
        return s1;
    }

    public int getSide2() {
        return s2;
    }

    public int getSide3() {
        return s3;
    }

    public int getSide4() {
        return s4;
    }

    public int getPerimeter() {
        return s1 + s2 + s3 + s4;
    }
}
