package day_26_ConstruChainingStatics;

import java.text.DecimalFormat;

public class TestCircleObject {
    public static void main(String[] args) {
        Circle1 circ1 = new Circle1(5,10);


        System.out.println(circ1.calcArea());
        System.out.println(circ1.calcPerimeter());
        System.out.println(Circle1.pi);

    }

}
