package day_18_JavaMemory_GarbageCollection;

public class PizzaTest {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        //pizza1.size='M';
       pizza1.setInfo('l',1,1);

        Pizza pizza2 = new Pizza();
        //pizza2.size='L';
        pizza2.setInfo('m',2,2);

        Pizza pizza3 = new Pizza();
        //pizza3.size='S';
        pizza3.setInfo('s',1,3);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        System.out.println("------------------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('S', 2, 2);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M', 3, 4);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L', 4, 5);
            total += large.calcCost();

        }

        System.out.println("total = " + total);

    }

}
