package day_07_IfStatement;

public class Task_2_GradeLevel {
    public static void main(String[] args) {
        int gradelevel = 17;
        String result = " ";

        if (gradelevel >= 1 && gradelevel <= 5) {
            result = "Elementary School";
        }
        else if (gradelevel >= 6 && gradelevel <= 8) {
            result="Middle school";
        }
        else if (gradelevel >= 9 && gradelevel <= 12) {
            result="High school";
        }
        else if (gradelevel >= 13 && gradelevel <= 16) {
            result="College";
        }
        else{
            result="Grad School";
        }
        System.out.println("Your Grade Level is: "+result);
    }
}
/*
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Assume that the given number is 1 ~ 18
 */
