package day_28_OOP_Encapsulation.square;

public class TestSquareObject {
    public static void main(String[] args) {

        Square sqr1 = new Square(4);

        sqr1.setVar(0);
        System.out.println(sqr1.getVar());

        System.out.println(sqr1.calcArea());
        System.out.println(sqr1.calcPerimeter());

    }

}
