package day_25_DateTimeContnueConstructorIntro;

public class TestSalaryObject {
    public static void main(String[] args) {

        SalaryC salary1 = new SalaryC(35,20,15,10);

        System.out.println(salary1);
        System.out.println(salary1.salary());
        System.out.println(salary1.stateTax());
        System.out.println(salary1.federalTax());
        System.out.println(salary1.salaryAfterTax());

        System.out.println("------------------------------");

        SalaryC salary2 = new SalaryC(20,20,5,10);
        System.out.println(salary2);
        System.out.println(salary2.salary());
        System.out.println(salary2.stateTax());
        System.out.println(salary2.federalTax());
        System.out.println(salary2.salaryAfterTax());


    }

}
