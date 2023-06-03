package day_9_ScannerI_ntro;

import java.util.Scanner;

public class Task_3_GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Score:  ");
        int score = input.nextInt();
        String result = "";
        //char result='';

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "A";
            }
            if (score >= 80 && score <= 89) {
                result = "B";
            }
            if (score >= 70 && score <= 79) {
                result = "C";
            }
            if (score >= 60 && score <= 69) {
                result = "D";
            } else {
                result = "F";

            }
        }else{
            result= "Invalid Result!";
        }

            System.out.println(result);

    }
}
/*
Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */