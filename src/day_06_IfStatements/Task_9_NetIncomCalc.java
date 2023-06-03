package day_06_IfStatements;

public class Task_9_NetIncomCalc {
    public static void main(String[] args) {
     double salary = 40000;
     double taxRate = 0;
     double salaryAfterTaxRate=salary-(salary*taxRate);

    boolean isMarried = true;
    String result = "";
        if(salary>=130_000){
            System.out.println(salary-(salary*35/100));//taxRate=0.35;
        }if(salary<130_000&&salary>=100_000){
            System.out.println(salary-(salary*30/100)); //taxRate=0.30;
        }if(salary<100_000&&salary>=80_000){
            System.out.println(salary-(salary*25/100)); //taxRate=0.25
        }if(salary<80_000){
            System.out.println(salary-(salary*20/100)); //taxRate = 0.20
        }if(isMarried){
            taxRate=0.05;
        }


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
 */
//double salaryAfterTax35_percent = salary-(salary*35/100);
//double salaryAfterTax30_percent = salary-(salary*30/100);
//double salaryAfterTax25_perecent=salary-(salary*25/100);
//double salaryAfterTax20_percent = salary-(salary*20/100);