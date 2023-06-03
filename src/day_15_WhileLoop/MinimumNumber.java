package day_15_WhileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 2147483647; // Maximum Integer number.

        for (int i = 0; i < 5; i++){
            System.out.println("Enter num:  "); //9,7,5,4,2
            int num = input.nextInt();

            if(num<min){ // If the user entry is less than the current minimum number that we have
                min=num; // then user entered number should be minimum number.
            }
        }
        System.out.println("min = " + min);
    }

}
//Write a program that can ask the user to enter a number for 5 times and returns the minimum number