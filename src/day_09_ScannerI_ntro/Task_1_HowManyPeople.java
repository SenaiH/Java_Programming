package day_09_ScannerI_ntro;

import java.util.Scanner;

public class Task_1_HowManyPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people they live with: ");
        int num = input.nextInt();
        String result = "";

        if(num<=3){
            result = "Live with less than 3 people";
        } else if (num>=3&&num<=6){
            result = "Live with 3 - 6 people";
        }else{
            result="Live with more than 6 people";
        }

        System.out.println(result);
    }


}
/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */