package day_24_ArrayListDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Task_8_BirthdayLeapYear {
    public static void main(String[] args) {

        System.out.println("Enter year of your birth:");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        LocalDate birthDay = LocalDate.of(year, 1,1);
        if(birthDay.isLeapYear()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //input.close();
    }

}
/*
Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false
 */