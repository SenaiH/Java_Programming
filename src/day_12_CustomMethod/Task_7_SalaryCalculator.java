package day_12_CustomMethod;

public class Task_7_SalaryCalculator {
    public static void main(String[] args) {
    salary(45,40);
        System.out.println("-----------------");
    salary(50,35);
        System.out.println("-----------------");
    salary(25,40);

    }
    public static void salary(double hourlyRate,int weeklyHour  ){


       double grossIncome = hourlyRate*weeklyHour*52;

        System.out.println("You make "+hourlyRate+" per hour.");
        System.out.println("You work "+weeklyHour+ " per week.");
        System.out.println("Your Gross income is "+ grossIncome);

    }
}
/*
Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */