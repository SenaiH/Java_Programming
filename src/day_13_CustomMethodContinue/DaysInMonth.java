package day_13_CustomMethodContinue;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        System.out.println("Enter number here: ");
        int month = new Scanner(System.in).nextInt();

        if(month<1||month>12){
            System.err.println("Invalid Month");
            return;
        }
     switch (month){
         case 2:
             System.out.println("has 28 days");
             break;
         case 4: case 6: case 8: case 11:
             System.out.println("has 30 days");
             break;
         default:
             System.out.println("has 31 days");


     }
    }
}
