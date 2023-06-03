package day_16_DoWhile_NestedLoop;

import java.util.Scanner;

public class Task6_GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    while (true){
        System.out.println("Enter score of students:");
        int score = input.nextInt();

        if(score<=0||score>100) {
            System.err.println("Invalid Score");
            System.exit(1);
        }
            char result =(score>=90&&score<=100)?'A':(score>=80&&score<90)?'B':(score>=70&&score<80)?'C':(score>=60&&score<70)?'D':'F';

            System.out.println(result);

            System.out.println("Would you like to continue");
            String answer = input.next().toLowerCase();

        while(!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid entry");
            answer = input.next().toLowerCase();

        }
       if(answer.equals("no")){
           System.out.println("Thank you for using Cydeo Grade Calculator APP");
           break;


        }
    }


    }

}
/*
Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */