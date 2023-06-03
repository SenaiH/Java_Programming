package day_6_IfStatements;

public class Task1_Cigarettes {
    public static void main(String[] args) {
        int age = 105;

        if(age>=21 && age<100) {
            System.out.println("You are eligible to buy cigarettes");
        }if(age<20 || age >100){
            System.out.println("You are not eligible to buy cigarettes");
        }
        //else{
           // System.out.println("You are an extraordinary smoker!.");
        //}

        }
}

/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that
can check if the person is eligible to buy cigarettes
Ex:
age = 20
output:
You are not eligible to buy Cigarettes
 */