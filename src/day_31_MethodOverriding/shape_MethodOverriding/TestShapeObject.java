package day_31_MethodOverriding.shape_MethodOverriding;

public class TestShapeObject {
    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("----------------------------");

       Circle circle = new Circle(3.5);

       System.out.println(circle);


    }
}
