package day_12_CustomMethod;

import java.util.Locale;

public class CustomMethodPractice {
    public static void main(String[] args) {

       printMaximumNumber(5,7);
       System.out.println("---------");
       printMaximumNumber(9,3);
       System.out.println("---------");
       printMaximumNumber(10,11);
       System.out.println("---------");
       printMaximumNumber(12,24/2);

        System.out.println("-----------------------------------------");

        initial("senai","haile");
        initial("cydeo","school");

        System.out.println("-----------------------------------------");

        sum(3,4);
        sum(399,567);
        sum(-8,89);
        sum(0,0);

    }

    public static void printMaximumNumber(int num1,int num2){
     if(num1>num2){
         System.out.println(num1 + " is greater than " + num2);
     }else if(num2>num1){
         System.out.println(num2 + " is greater than "+ num1);
     }else{
         System.out.println("Both numbers are equal");
     }


    }
    public static void initial(String firstName,String lastName){

        firstName=firstName.substring(0,1).toUpperCase();
        lastName=lastName.substring(0,1).toUpperCase();

       // String initial = firstName.charAt(0)+"."+lastName.charAt(0);

       // System.out.println(initial);

        System.out.println(firstName);
        System.out.println(lastName);

    }

    public static void sum (int num1,int num2){
        int sum = num1 +num2;

        System.out.println(sum);
    }

}

// Q1. Print Maximum Number.
// Q2. Print initials of a Person.