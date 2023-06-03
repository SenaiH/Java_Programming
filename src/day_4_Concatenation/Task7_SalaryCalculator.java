package day_4_Concatenation;

public class Task7_SalaryCalculator {
    public static void main(String[] args) {
         int hourlyRate = 50;
         int weeklyHours = 45;
         double  stateTaxRate = 6/100d;
         double  federalTaxRate = 26/100d;
        int salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax = salaryBeforeTax*stateTaxRate;
        double federalTax = salaryBeforeTax*federalTaxRate;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax+"\n\t\tFederal tax is: $"+federalTax+"\n\t\tState tax is: $"+stateTax+"\n\t\tTotal tax is: $"+totalTax+"\n\t\tNet income is: $"+salaryAfterTax );

    }
}
/*
Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
 */