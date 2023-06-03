package day_09_ScannerI_ntro;

import java.util.Scanner;

public class Task_5_CentsToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:  ");
        double cents = input.nextDouble();
        double dollar1 = 0.01 * cents;

        System.out.println(cents + " cents is equal to: " + dollar1 + " dollars");
    }

}
/*
Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */