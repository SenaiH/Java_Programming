package day_09_ScannerI_ntro;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter month number here: ");
        int m = input.nextInt();

    String result = "Invalid";

    if(m>=1&&m<=12){
        result=(m==1)?"January":(m==2)?"February":(m==3)?"March":(m==4)?"April":(m==5)?"May":(m==6)?"June":(m==7)?"July":(m==8)?"August":(m==9)?"September":(m==10)?"October":(m==11)?"November":"December";
    }else{
        result="Invalid Month!";
    }
    System.out.println("The number represents the month of: "+result);
    }

}
