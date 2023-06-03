package day_14_forLoop;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner iput = new Scanner(System.in);
        System.out.println("Enter num here: ");

        int num = iput.nextInt();

        int factorial = 1;

        for(int i = 1; i <= num; i++)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("factorial of " + num +" is: "+ factorial);
    }

}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */