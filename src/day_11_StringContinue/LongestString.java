package day_11_StringContinue;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first String:");
        String first = input.nextLine();

        System.out.println("Enter second String:");
        String second = input.nextLine();

        if(first.length()>second.length()){
            System.out.println("first string is longest");
        }else if(second.length()>first.length()){
            System.out.println("second string is longest");
        }else{
            System.out.println("Equal");
        }
    }

}



/*
 Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"
 */