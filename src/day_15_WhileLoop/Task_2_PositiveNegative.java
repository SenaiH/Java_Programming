package day_15_WhileLoop;

import java.util.Scanner;

public class Task_2_PositiveNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int PosNumber = 0;
        int NegNumber = 0;

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();


            if (num > 0) {
                PosNumber++;
            } if (num < 0) {
                NegNumber++;
            }
        }
        System.out.println(PosNumber + " Positive and " +NegNumber +" Negative number");
    }
}

/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */