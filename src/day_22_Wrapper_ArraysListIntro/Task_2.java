package day_22_Wrapper_ArraysListIntro;

import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {

        String str = "JAVA java";
        boolean chars ;

        ArrayList<Character> upperCase = new ArrayList<>();
        ArrayList<Character> lowerCase = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase.add(ch);
            } else if (Character.isLowerCase(ch)) {
                lowerCase.add(ch);
            }
        }
        System.out.println("uppercase = " + upperCase);
        System.out.println("lowercase = " + lowerCase);

        chars = (upperCase.size() == lowerCase.size());

        System.out.println(chars);

        System.out.println("------------------------------------");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)==Character.isLowerCase(ch)) {
                System.out.println(chars);
            }
        }

    }
}


/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
 */