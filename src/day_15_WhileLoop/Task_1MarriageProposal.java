package day_15_WhileLoop;

import java.util.Scanner;

public class Task_1MarriageProposal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Will you marry me? ");
        String answer = input.nextLine();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.err.println("Invalid answer, please re-enter");
            answer = input.nextLine();
        }
        if (answer.equals("yes")) {
            System.out.println("Congrats");
        } if(answer.equals("no")) {
            System.out.println("Goodbye");
        }

    }

}
/*
Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */