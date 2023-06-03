package day_11_StringContinue;

import java.util.Scanner;

public class Task_8_TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split? ");
        String split = scan.nextLine();

        System.out.println("Enter the number of people (number): ");
        int people = scan.nextInt();

        System.out.println("Enter the check amount: ");
        double check = scan.nextDouble();

        scan.nextLine();

        System.out.println("Service quality: ");
        String quality = scan.nextLine();

        scan.close();

        double tipRate = (quality.equals("excellent"))? 0.25 :(quality.equals("great"))? 0.20 :(quality.equals("good"))?  0.15
                :(quality.equals("fair"))? 0.10 :  0.05 ;

        double totalPay = check +(check*tipRate);
        double totalTip = check*tipRate;
        double totalPerPerson = totalPay/people;
        double tipPerPerson = totalTip/people;

        if(split.equals("yes")) {


            System.out.println(people);
            System.out.println("totalPay = " + totalPay);
            System.out.println("totalTip = " + totalTip);
            System.out.println("totalPerPerson = " + totalPerPerson);
            System.out.println("tipPerPerson = " + tipPerPerson);

        }else{
            System.out.println(people);
            System.out.println("totalPay = " + totalPay);
            System.out.println("totalTip = " + totalTip);

        }

    }
}
/*
 Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */