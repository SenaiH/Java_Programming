package day_29_Inheritance.employeeTask;

public class TestPersonObject {
    public static void main(String[] args) {

        Developer dev  = new Developer();
        dev.setInfo("Daniel","Engineer","DAD43",'M',36,100_000);

        System.out.println(dev);

        Tester tester = new Tester();
        tester.setInfo("Salem","DEV","IOUY454",'F',36,120_000);
        System.out.println(tester);

        Teacher teacher  = new Teacher();
        teacher.setInfo("Senait","teacher","GAFR567",'F',35,129_000);
        System.out.println(teacher);

        Driver driver = new Driver();
        driver.setInfo("Senai","Truck Dr","HGSR546",'M',64,120_000);
        System.out.println(driver);

        dev.setName("Berhane");

        System.out.println(dev);

        dev.drink();
        driver.drink();
        tester.drink();
        teacher.drink();

        dev.coding();
        dev.language();
        teacher.teaching();
        driver.driving();
        tester.testing();


    }

}
