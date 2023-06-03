package day_15_WhileLoop;

import java.util.Scanner;

public class Task_3_FrequencyofChars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String here: ");
        String str = input.nextLine();
        System.out.println("Enter char here:  ");
        char chars =input.next().charAt(0);

        int countChar = 0;

        for (int i = 0; i <str.length() ; i++) {
            char chr=str.charAt(i);
            if(chars==chr){
            countChar++;
            }
        }

       System.out.println("String contains "+countChar+ chars+" characteristics");
        input.close();
    }

}
/*
Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */