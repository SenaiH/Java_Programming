package day_17_CustomClass;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Senai",36,'M',"Engineer",100_000,"AD12");

        Employee employee2 = new Employee();
        employee2.setInfo("Selam",30,'F',"Developer",80_000,"A2");

        Employee employee3 = new Employee();
        employee3.setInfo("Daniel",36,'M',"Farmer",90_000,"D12");

        Employee employee4 = new Employee();
        employee4.setInfo("Senait",6,'F',"Manager",120_000,"D1");

        Employee employee5 = new Employee();
        employee5.setInfo("Salem",12,'F',"CEO",140_000,"AD1");

        employee2.age=40;

        employee4.name = "Amanuel";

        employee5.jobtitle = "CFO";



        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);
        System.out.println("employee4 = " + employee4);
        System.out.println("employee5 = " + employee5);

        employee1.work();

    }

}
