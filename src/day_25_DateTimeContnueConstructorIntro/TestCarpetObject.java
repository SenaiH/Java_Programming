package day_25_DateTimeContnueConstructorIntro;

public class TestCarpetObject {
    public static void main(String[] args) {
        Carpet1 carpt1 = new Carpet1(4,6,20,false);

        System.out.println(carpt1);

        System.out.println(carpt1.calcCost());

        System.out.println(carpt1.totalCost());

        Carpet1 carpt2 = new Carpet1(5,5,15,true);

        System.out.println(carpt2);

        System.out.println(carpt2.calcCost());

        System.out.println(carpt2.totalCost());

        Carpet1 carpt3 = new Carpet1(2,2,20,true);

        System.out.println(carpt3);

        System.out.println(carpt3.calcCost());

        System.out.println(carpt3.totalCost());

    }


}
