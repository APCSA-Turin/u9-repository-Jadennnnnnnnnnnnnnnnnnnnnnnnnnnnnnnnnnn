public class QuadrilateralRunner {
    public static void main(String[] args) {
        Quadrilateral myQuad = new Quadrilateral(1, 2, 3, 4);
        System.out.println(myQuad.getSide1());
        System.out.println(myQuad.getSide2());
        System.out.println(myQuad.getSide3());
        System.out.println(myQuad.getSide4());
        System.out.println(myQuad.getPerimeter());
        System.out.println();

        Rectangle myRect = new Rectangle(4, 4);
        System.out.println(myRect.getSide1());
        System.out.println(myRect.getSide2());
        System.out.println(myRect.getSide3());
        System.out.println(myRect.getSide4());
        System.out.println(myRect.getPerimeter());
        System.out.println(myRect.getIsSquare());
        System.out.println(myRect.getArea());
        System.err.println();

        Rhombus myRhom = new Rhombus(30, 4);
        System.out.println(myRhom.getSide1());
        System.out.println(myRhom.getSide2());
        System.out.println(myRhom.getSide3());
        System.out.println(myRhom.getSide4());
        System.out.println(myRhom.getPerimeter());
        System.out.println(myRhom.getDegree());
        System.out.println(myRhom.getArea());
    }
}
