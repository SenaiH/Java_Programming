package day_9_ScannerI_ntro;

import java.util.Scanner;


//import java.util.*;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number here: ");
        byte num1 = input.nextByte();
        System.out.println("Enter second number here: ");
        short num2 = input.nextShort();
        System.out.println("Entre third number here: ");
        int num3 = input.nextInt();
        // int numm = input.nextLong();   int numm = (int)input.nextLong(); Casting.
        System.out.println("Enter fourth number here: ");
        long num4 = input.nextLong();



        System.out.println("Enter fifth number here: ");
        int num5 = input.nextInt();

        System.out.println("You entered: " + num1);
        System.out.println("You entered: " + num2);
        System.out.println("You entered: " + num3);
        System.out.println("You entered: " + num4);
        System.out.println("You entered: " + num5);

        input.close(); // Scanner is closed, can't get user input.
    }

}
//input.close();