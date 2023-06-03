package day_07_IfStatement;

public class Task_4_WeekDays {
    public static void main(String[] args) {
        int day = 3;
        String result = "";
        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wedensday";
        } else if (day == 4) {
            result = "Thusday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else {
            result = "Sunday";
        }
        System.out.println(result);

        System.out.println("------------------------------------------------");

        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wedensday");
        else if (day == 4) System.out.println("Thusday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
            // else if (day==2)
        else System.out.println("Sunday");


    }

}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents.
Ex:
Given:
number = 1
output:
Monday
Note: Assume that the given number is between 1 ~ 7
 */