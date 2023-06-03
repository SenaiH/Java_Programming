package day_13_CustomMethodContinue;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        System.out.println("Enter number here:  ");
        int number = new Scanner(System.in).nextInt();

        if(number<0||number>7){
            System.err.println("Invalid "+ number);
            return;
        }
        System.out.println((number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednsday":(number==4)?"Thursday"
                :(number==5)? "Friday":(number==6)?"Saturday":"Sunday");
    }

}
