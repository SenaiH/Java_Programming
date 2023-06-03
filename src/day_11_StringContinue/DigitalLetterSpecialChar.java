package day_11_StringContinue;

import java.util.Scanner;

public class DigitalLetterSpecialChar {
    public static void main(String[] args) {

     /*   // Scanner input = new Scanner(System.in);  //=====> possible

      System.out.println("".charAt(0));
       String str = new Scanner(System.in).nextLine();

       // System.out.println("Enter String");=====> Possible
       // String str = input.nextLine(); =====> possible

        if(str.length()>=1){
            char f = str.charAt(0);
      if(f>='0'&&f<='9'){  // f>= 48 && f<=57 ASCII Table
          System.out.println("First character is digit");
      } else if (f>='A'&&f<='Z') {
          System.out.println("First character is uppercase");
      } else if (f>='a'&&f<='z') {
          System.out.println("First character is lowercase");
      }else {
          System.out.println("First character is special character");

        }
    }else{
            System.out.println("Empty String");
        }

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
Scanner input = new Scanner(System.in);
        System.out.println("Enter a word here: ");
        String word = input.nextLine();
        String result = "";

        if(word.length()>=1){
        if(word.charAt(0)>='0'&&word.charAt(0)<='9'){
            result = "first character is digit";
        } else if (word.charAt(0)>='a'&&word.charAt(0)<='z') {
            result = "first character is lowercase letter";
        } else if (word.charAt(0)>='A'&&word.charAt(0)<='Z') {
            result = "first character is uppercase letter";
        }else {
            result = "first character is special character";
        }
            }else{
            result="String is Empty";
        }
        System.out.println(result);

        System.out.println("-------------------------");

        String w = "Java Python Javascript";
        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf('a'));

    }
}