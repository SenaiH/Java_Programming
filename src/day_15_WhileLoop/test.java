package day_15_WhileLoop;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 2147483647;
        int num = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number: ");
            num=input.nextInt();
       if(num<min){
           min=num;
       }
        }
        System.out.println("min = " + min);
    }

}
