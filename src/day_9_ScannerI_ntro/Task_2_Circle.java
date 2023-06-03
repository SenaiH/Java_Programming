package day_9_ScannerI_ntro;

import java.util.Scanner;

public class Task_2_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");

        int r = input.nextInt();

         int Area = r*r;
         double Perimeter = 2*Math.PI*r;

        System.out.println("r = " + r);
         System.out.println("Perimeter = " + Perimeter);
         System.out.println("Area = " + Area);
    }

}

/*
Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */