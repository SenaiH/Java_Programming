package day_15_WhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter Math Operator: ");
        char operator = input.next().charAt(0);

   while(!(operator=='+'||operator=='-'||operator=='*'||operator=='/')){
       System.err.println("Invalid entry, please re-enter operator again!");
       operator=input.next().charAt(0);
   }
   switch (operator){
       case '+':
           System.out.println(num1+num2);
           break;
       case '-':
           System.out.println(num1-num2);
           break;
       case '*':
           System.out.println(num1*num2);
           break;
       default:
           System.out.println(num1/num2);
   }

    }

}
