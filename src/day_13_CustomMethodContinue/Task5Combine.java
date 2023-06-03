package day_13_CustomMethodContinue;

import java.util.Scanner;

public class Task5Combine {
    public static void main(String[] args) {
   combine("","");

    }
    public static void combine(String str1,String str2){
        System.out.println("Enter first word here: ");
        str1= new Scanner(System.in).nextLine();
        System.out.println("Enter second word here: ");
        str2 = new Scanner(System.in).nextLine();

        String result = "";

        if(str1.charAt(str1.length()-1)==str2.charAt(0)){
            result =(str1.substring(0,str1.length()-1)+str2.substring(0));
        }else{
            result=(str1+str2);
        }
        System.out.println(result);
    }

}

/*
Create a method named combine that can take two string and then add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
 */