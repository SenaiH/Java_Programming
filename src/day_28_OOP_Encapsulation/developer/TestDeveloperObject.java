package day_28_OOP_Encapsulation.developer;

public class TestDeveloperObject {
    public static void main(String[] args) {
     Developer developer = new Developer();
     developer.setInfo("Abraham","Engineer","Java",'M',56,100,120_000);

        System.out.println(developer);
    }

}
