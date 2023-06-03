package day_15_WhileLoop;

import java.util.Scanner;

public class Task_4_DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        double counter = 0;

        while (num1>=num2){
            num1-=num2;
            counter++;
        }
        System.out.println(counter + " remainder "+ num1);

    }

}
/*
Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */