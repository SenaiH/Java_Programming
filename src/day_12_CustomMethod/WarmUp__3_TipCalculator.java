package day_12_CustomMethod;

import java.util.Scanner;

public class WarmUp__3_TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Split or NoSplit?");
        String splitNosplit = input.next().toLowerCase();

        System.out.println("Enter number of people");
        int numPeople = input.nextInt();

        System.out.println("Enter check amount");
        double check = input.nextDouble();

        input.nextLine();

        System.out.println("Enter service quality. Excellent/verygood/good/fair/poor");
        String service = input.next().toLowerCase();

        double totalTip=(service.equals("excellent"))?check*0.25:(service.equals("great"))?check*0.2
                :(service.equals("good"))?check*0.15:(service.equals("fair"))?check*0.10
                :check*0.05;
        double totalTopay = check+totalTip;

        System.out.println(numPeople);
        System.out.println(service);
        System.out.println(totalTopay);

        if(splitNosplit.equals("yes")){
            System.out.println("Tip per person: "+(totalTip/numPeople));
            System.out.println("Total per person: "+(totalTopay/numPeople));
        }else {
            System.out.println(numPeople);
            System.out.println(totalTip);
            System.out.println(totalTopay);
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
		        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt

		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75
 */