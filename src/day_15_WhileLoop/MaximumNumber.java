package day_15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {Scanner input = new Scanner(System.in);

        int max = -2147483648; // MinimumInteger number.

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter num:  ");
            int num = input.nextInt();

            if(num>max){
                max=num;
            }
        }
        System.out.println("max = " + max);

    }

}
/*
write a program that asks a user to enter 5 numbers five times and return the maximum number.
 */