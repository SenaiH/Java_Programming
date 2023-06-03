package day_6_IfStatements;

public class Task8_NumberofDays {
    public static void main(String[] args) {
        int m = 2;

        boolean has31days = m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12;
        boolean has30days = m == 4 || m == 6 || m == 9 || m == 11;
        boolean has28days = m == 2;
        //  boolean has31days = !has30days && !has28days

        String result = "";

        if (has31days) {
            result = "Has 31 Days";
        }
        if (has30days) {
            result = "Has 30 Days";
        }
        if (has28days) {
            result = "Has 28 Days";
        }
        System.out.println(result);

        System.out.println("-----------------------------");

        switch (m){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:

        }


    }
}
/*
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */