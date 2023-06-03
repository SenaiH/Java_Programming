package day_12_CustomMethod;

import java.util.Scanner;

public class Task_6_EligibleToVote {
    public static void main(String[] args) {
        vote(34,true);
        vote(12,false);
        vote(34,false);
        vote(12,true);
        vote(21,true);

    }
    public static void vote(int age,boolean isAmerican){

        if(age>=21&&isAmerican){
            System.out.println("You're Eligible to vote");
        }else{
            System.out.println("You're not Eligible to vote");
        }

    }



}
/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */