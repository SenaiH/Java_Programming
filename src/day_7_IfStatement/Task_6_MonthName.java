package day_7_IfStatement;

public class Task_6_MonthName {
    public static void main(String[] args) {
        int num = 7;
        String result = "";

        if (num >= 1 && num <= 12) {
            if (num == 1) {
                result = "January";
            } else if (num == 2) {
                result = "February";
            } else if (num == 3) {
                result = "March";
            } else if (num == 4) {
                result = "April";
            } else if (num == 5) {
                result = "May";
            } else if (num == 6) {
                result = "June";
            } else if (num == 7) {
                result = "July";
            } else if (num == 8) {
                result = "August";
            } else if (num == 9) {
                result = "September";
            } else if (num == 10) {
                result = "October";
            } else {
                result = "December";
            }

        } else {
            result = "Invalid Month!";
        }
        System.out.println(result);
    }

}
/*
Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents.
Ex:
Given:
number = 10
output:
October
Note: Assume that the given number is between 1 ~ 12
 */