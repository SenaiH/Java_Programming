package day_28_OOP_Encapsulation.rectangle;

public class TestRectangleObject {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6,8);
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());

        rectangle.setLength(5);
        rectangle.setWidth(4);

        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());
    }

}
