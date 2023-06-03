package day_12_CustomMethod;

import java.util.Scanner;

public class day12_CustomMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstName:");
        String firstName = input.nextLine().trim().replace(" ","");

        System.out.println("Enter lastName:");
        String lastName = input.nextLine().trim().replace(" ","");

        input.close();

        //String firstName = "tekLEHAIMAnoT";
        //String lastName = "welDEgAbER";
        
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        

    }

}
/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */