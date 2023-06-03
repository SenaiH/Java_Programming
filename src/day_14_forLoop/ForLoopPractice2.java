package day_14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {

      //Enter 10 numbers
        Scanner input = new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Number here: ");
            sum+=input.nextInt();
            //int num = input.nextInt();
        }
        System.out.println("Sum: " + sum);
        // enter sum of first 10 numbers
       /* int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            sum+=input.nextInt();
        }
        System.out.println(sum +" ");*/

   // write a program that asks a user to enter 5 numbers five times and print the maximum number.

        //write a program that asks a user to enter 5 numbers five times and print the maximum number.

    }

}
