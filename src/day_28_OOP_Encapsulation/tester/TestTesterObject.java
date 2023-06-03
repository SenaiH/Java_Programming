package day_28_OOP_Encapsulation.tester;

public class TestTesterObject {
    public static void main(String[] args) {

        Tester test1 = new Tester();
        test1.setInfo("Senai","Engineer",'M',36,6754,100_000);

        System.out.println(test1);

        test1.setName("Daniel");
        System.out.println(test1);

        test1.setGender('K');

        System.out.println(test1);

        test1.setName("Abraham");

        System.out.println(test1);

        test1.setAge(0);

        System.out.println(test1);

        test1.testing();
    }

}
