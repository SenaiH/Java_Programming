package day_09_ScannerI_ntro;

import java.util.Scanner;

public class Task_10_SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("$ Rate/hour?");
        int hourlyRate = input.nextInt();

        System.out.println("Working hours/week");
        int workingHours = input.nextInt();

        System.out.println("State Tax");
        double stateTax = input.nextDouble();


        System.out.println("Federal Tax");
        double FedTax = input.nextDouble();


        double salary = hourlyRate*workingHours;
        stateTax = stateTax*salary;
        FedTax = FedTax*salary;
        double totalTax = stateTax+FedTax;
        double netIncome =salary-totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("FedTax = " + FedTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

    }
}
/*
10. Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */