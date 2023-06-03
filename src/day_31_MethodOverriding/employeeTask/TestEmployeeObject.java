package day_31_MethodOverriding.employeeTask;

public class TestEmployeeObject {
    public static void main(String[] args) {
        Developer dev =  new Developer("Senai","Engineer","Amazon",36,564,'M',100000,"Java");
        Driver dr =  new Driver("Salem","Truck Driver","Google",36,675,'F',120000);
        Teacher teach = new Teacher("Senait","Teacher","Code",35,675,'F',90000);
        Tester test = new Tester("Selam","SDET","Sony",35,876,'F',78000);

        System.out.println(dev);
        System.out.println(dr);
        System.out.println(teach);
        System.out.println(test);
        System.out.println("-------------------------------------------");
        dev.work();
        dr.work();
        test.work();
        teach.work();

    }
}
