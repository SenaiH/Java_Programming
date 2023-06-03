package day_6_IfStatements;

public class Task_9_Trial {
    public static void main(String[] args) {
       int salary = 130_000;
       double taxRate =0;
       double salaryAfterTax = salary-(salary*taxRate);
       boolean isMarried = false;
       if(salary>=130_000){
           salaryAfterTax=salary-(salary*0.35);
       }if(salary>=100_000&&salary<=129_000){
            salaryAfterTax=salary-(salary*0.30);
        }if(salary>=80_000&&salary<=99_000){
            salaryAfterTax=salary-(salary*0.25);
        }if(salary<=79_000){
           salaryAfterTax=salary-(salary*0.20);
        } else if (isMarried) {
            salaryAfterTax=salaryAfterTax+(salary*0.05);
        }

        System.out.println(salaryAfterTax);
        System.out.println("------------------------------------------");

        int sal = 130_000;
        double salAfterTax = 0;
        boolean issMarried = true;
        double taxRatte=0;

        if(sal>=130_000){
           taxRatte=0.35;
        }if(sal>=100_000&&sal<=129_000){
            taxRatte=0.30;
        }if(sal>=80_000&&sal<=99_000){
            taxRatte=0.25;
        }if(sal<=79_000){
            taxRatte=0.29;
        }if(issMarried){
            taxRatte-=0.05;

        }
        salAfterTax = sal -(sal*taxRatte);
        System.out.println("salAfterTax = " + salAfterTax);
        System.out.println("taxRatte = " + taxRatte);
        System.out.println("sal = " + sal);
        System.out.println("salaryAfterTax = " + salaryAfterTax);

    }

}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
  Double taxRate = 0.0;
        int salary = 130000;
        double afterTaxSalary = salary - (salary * taxRate);
        double isMarriedTax = 0.05;
        boolean isMarried = false;

        if (salary >= 130000){
            afterTaxSalary = salary - (salary * 0.35);
        }
        if (salary == 100000 && salary <= 129){
            afterTaxSalary = salary - (salary * 0.30);
        }
        if (salary == 80000 && salary<=99000){
            afterTaxSalary = salary - (salary * 0.25);
        }
        if (salary <=79000){
            afterTaxSalary = salary - (salary * 0.20);
        } else if (isMarried){
           afterTaxSalary = salary - (salary * taxRate) + (salary * 0.05);
        }
        System.out.println(afterTaxSalary);
 */