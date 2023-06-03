package day_17_CustomClass;

public class SalaryCalculatorTest {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator();
        salary1.hourlyRate = 52;
        salary1.weeklyHours = 40;
        salary1.stateTaxRate = 20;
        salary1.federalTaxRate = 15;

        System.out.println(salary1);
        salary1.Salary();
        salary1.setStateTaxRate();
        salary1.setFederalTaxRate();
        salary1.setSalaryAfterTax();
        System.out.println("------------------------");


    SalaryCalculator salary2 = new SalaryCalculator();
    salary2.setInfo(45,40,0.20,0.30);

    System.out.println(salary2);
        System.out.println(salary2.Salary());
        System.out.println(salary2.setStateTaxRate());
        System.out.println(salary2.setFederalTaxRate());
        System.out.println(salary2.setSalaryAfterTax());

    }

}
