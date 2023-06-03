package day_12_CustomMethod;

import java.util.Scanner;

public class Task_1_EmailDomain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Email here: ");
        String email = input.nextLine();

        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println("The domain of the email is: "+domain);
    }

}
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */