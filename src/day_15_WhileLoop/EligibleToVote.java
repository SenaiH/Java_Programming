package day_15_WhileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age here:  ");
        int age = input.nextInt(); //1~120

        while(!(age>=1&&age<=120)){  // while the age is not valid
            System.err.println("Invalid entry,Please re-enter your age!");
            age = input.nextInt();
        }
        System.out.println("Are you a US citzen?Yes/No");
        String YesNo = input.next().toLowerCase();

        while(!(YesNo.equals("yes")||(YesNo.equals("no")))){ // while the answer is neither yes or no.
        System.err.println("Invalid Entry,Please re-enter: ");
        System.err.println("Are you a US citzen? Yes/No");
        YesNo=input.next().toLowerCase();

    }
        if(age>=21&&YesNo.equals("yes")){
            System.out.println("You're eligible to vote");
        }else{
            System.out.println("You're not eligible");
        }
    }

}
