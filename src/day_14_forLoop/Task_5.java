package day_14_forLoop;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter input here:  ");
        String str = input.nextLine();

        String letters = "";
        String digits = "";
        String specialchar = "";

        for (char i = 0 ; i <str.length() ; i++) {
            char word= str.charAt(i);

            if(word>='A'&&word<='Z'||word>='a'&&word<='z'){
                letters+=word;
            } else if (word>='0'&&word<='9') {
                digits+=word;
            }else{
                specialchar+=word;
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialchar);
    }

}

/*
write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */