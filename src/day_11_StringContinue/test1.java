package day_11_StringContinue;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter a word here: ");
        String word = input.nextLine();


       String result = "";

       if(word.charAt(0)>='0'&&word.charAt(0)<='9'){
           result="first character is digit";
       } else if (word.charAt(0)>='a'&&word.charAt(0)<='z') {
           result="first character is lowercase letter";
       } else if (word.charAt(0)>='A'&&word.charAt(0)<='Z') {
           result="Upper case letter";
       }else{
           result="Special characters";
       }
        System.out.println(result);

    }

}
/*
Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table
 */