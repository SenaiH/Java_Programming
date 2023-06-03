package day_9_ScannerI_ntro;

import java.util.Scanner;

public class Task_9_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Fist Num:  ");
        int num1 = input.nextInt();

        System.out.println("Math Operator:  ");
        char m = input.next().charAt(0);

        System.out.println("Enter Second Num");
        int num2 = input.nextInt();


        double result=(m=='+')? num1+num2:(m=='-')?num1-num2:(m=='*')?num1*num2:num1/num2;

        System.out.println(result);








    }

}
/*
Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
 */