package day_11_StringContinue;

import java.util.Scanner;

public class Task_7_EmailTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.nextLine();

        //input.close();

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("First name: " + firstName.toUpperCase().charAt(0)+firstName.substring(1));
        System.out.println("Last name: " + lastName.toUpperCase().charAt(0)+lastName.substring(1));
        System.out.println("Domain: " + domain);

     /*  String email = "craig_federighi@apple.com";

        String firsName = "";
        String lastName = "";
        String domain = "";
        String result = "";

            firsName= email.substring(0,5);

            lastName=email.substring(6,14+1);

             domain = email.substring(16,21);




        System.out.println("firsName = " + firsName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);*/
    }

}

/*
 Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */