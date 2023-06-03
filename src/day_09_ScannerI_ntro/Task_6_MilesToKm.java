package day_09_ScannerI_ntro;

import java.util.Scanner;

public class Task_6_MilesToKm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles here:   ");
        double miles = input.nextDouble();
        double km = miles/0.62;

        System.out.println( miles + " miles is "+km+ " is kilometers");
    }

}
/*
Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */