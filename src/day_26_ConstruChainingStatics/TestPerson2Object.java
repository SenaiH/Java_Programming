package day_26_ConstruChainingStatics;

public class TestPerson2Object {
    public static void main(String[] args) {
       Person2 per1 = new Person2("Senai",36,'M');
       Person2 per2 = new Person2("Daniel",45,'M');
        System.out.println(per1);
        per1.eat("Salad");
        per1.drink1("Juice");
        per1.sleep();

        System.out.println("----------------------------------");

        System.out.println(Person2.hasWing);
        System.out.println(Person2.numberOfHead);






    }


}
