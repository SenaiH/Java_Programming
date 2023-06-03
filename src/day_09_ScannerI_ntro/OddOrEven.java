package day_09_ScannerI_ntro;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here: ");

        byte num = input.nextByte();

        String result = "";

        if( num%2==0||num%2!=0){
            result=(num%2==0)?"Even":"Odd";
        }
        System.out.println(result);
    }

}
