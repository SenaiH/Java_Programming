package day_13_CustomMethodContinue;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
   calculate(3,2,'-');
        calculate(4,6,'+');
        calculate(5,5,'/');
        calculate(6,2,'*');
        calculate(3,5,'@');

        System.out.println("----------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers and Math Operator here: ");
        double n1=input.nextDouble(),
                n2 = input.nextDouble();
        char operator = input.next().charAt(0);
        calculate(n1,n2,operator);
        System.out.println("------------------------------------");
        ageGroup(21);
        ageGroup(10);
        ageGroup(150);
        ageGroup(60);
        ageGroup(34);
        System.out.println("------------------------------------");
        voteElegibility(23,true);
        voteElegibility(18,true);
        voteElegibility(34,false);


    }
    public static void calculate(double num1,double num2,char mathOperator) {

        if (mathOperator == '+' || mathOperator == '-' || mathOperator == '/' || mathOperator == '*') {
            if (mathOperator == '+') {
                System.out.println(num1 +""+mathOperator+""+num2 + "=" + (num1 + num2));
            }
            if (mathOperator == '-') {
                System.out.println(num1 +""+mathOperator+""+num2 + "=" + (num1 - num2));
            }
            if (mathOperator == '/') {
                System.out.println(num1 +""+mathOperator+""+num2 + "=" + (num1 / num2));
            } if(mathOperator == '*') {
                System.out.println(num1 +""+mathOperator+""+num2 + "=" + (num1 * num2));
            }
        }else{
            System.out.println("Invalid"+mathOperator);
        }
    }
    public static void ageGroup(int age){

        String result = (age>=0&&age<=100)?(age<21)?"Teenager":(age>=21&&age<55)?"Adult":"Senior":"Invalid age!";
        System.out.println(result);
    }

    public static void voteElegibility(int age,boolean isAmerican){
        if(age>=21&&isAmerican){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to vote");
        }
    }
}
/*
Warmup task:
	1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote
 */