package day_09_ScannerI_ntro;

import java.util.Scanner;

public class EligibleAlcoholAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age here: ");
        int age = input.nextInt();

        String result = "";

        if(age>=21&&age<=100){
            result=(age>=21)?"Eligible to buy Alcohol":"Not Eligible to buy Alcohol";
        }else{
            result="Not Valid age";
        }
        System.out.println(result);
    }

}
