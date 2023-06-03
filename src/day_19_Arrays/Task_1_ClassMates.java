package day_19_Arrays;

import java.util.Arrays;

public class Task_1_ClassMates {
    public static void main(String[] args) {

        String ClassMates [] = {"Senai","Salem","Senait","Ahmed","Jawid","Naseem","Khalil","Mohammad","Selamawit","Sally"};

        for (int i = 0; i < ClassMates.length; i++) {

            System.out.print(ClassMates[i].substring(0,1)+",");
        }

    }

}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */