package day_28_OOP_Encapsulation.circle;

public class TestCircleObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(1);

       circle1.setRadius(6);

       System.out.println(circle1.getRadius());

        System.out.println(circle1.calcArea());
        System.out.println(circle1.perimeter());
    }


}
