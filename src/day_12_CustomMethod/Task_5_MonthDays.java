package day_12_CustomMethod;

public class Task_5_MonthDays {
    public static void main(String[] args) {

        month("June");
        month("December");
        month("February");
        month("Senai");
        month("May");

    }

    public static void month(String month1) {

        boolean has31days = month1 == "January" || month1 == "March" || month1 == "May" || month1 == "July" || month1 == "August" || month1 == "October" || month1 == "December";
        boolean has30days = month1 == "April" || month1 == "June" || month1 == "September" || month1 == "November";
        boolean has28days = month1 == "February";

        if (has31days || has30days ||has28days) {
            if (has31days) {
                System.out.println(month1 + " has 31 days");
            } else if (has30days) {
                System.out.println(month1 + " has 30 days");
            } else {
                System.out.println(month1 + " has 28 days");
            }

        } else {
            System.out.println("Invalid Month");
        }

    }
}

/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */