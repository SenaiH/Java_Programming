package day_13_CustomMethodContinue;

import java.util.Scanner;

public class Task7_Title {
    public static void main(String[] args) {

        title("");
    }
    public static void title(String str1){
        System.out.println("Enter word here: ");
        str1 = new Scanner(System.in).nextLine();

        String result = str1.toUpperCase().charAt(0)+str1.toLowerCase().substring(1);

        System.out.println(result);
    }


}
/*
Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
 */