package day_25_DateTimeContnueConstructorIntro;

public class TestPizzacObject {
    public static void main(String[] args) {

        Pizzac pizzac1 = new Pizzac('M',2,2);

        System.out.println(pizzac1);
        pizzac1.calcCost('S');

        Pizzac pizzac2 = new Pizzac('L',3,4);

        System.out.println(pizzac2);

        pizzac2.calcCost('L');


    }

}
