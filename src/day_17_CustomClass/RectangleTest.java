package day_17_CustomClass;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(5,7);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(10,7);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(50,70);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(5,5);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(7,7);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();

        rectangle3.calculateArea();
        rectangle3.calculatePerimeter();

        rectangle4.calculateArea();
        rectangle4.calculatePerimeter();

        rectangle5.calculateArea();
        rectangle5.calculatePerimeter();

    }

}
