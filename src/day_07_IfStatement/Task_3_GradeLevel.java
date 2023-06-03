package day_07_IfStatement;

public class Task_3_GradeLevel {
    public static void main(String[] args) {
        int gradelevel = 67;
        String result = "";
        if (gradelevel >= 1 && gradelevel <= 5) {
            result = "Grade leve is: Elementary school";
        } else if (gradelevel >= 6 && gradelevel <= 8) {
            result = "Grade leve is: Middle school";
        } else if (gradelevel >= 9 && gradelevel <= 12) {
            result = "Grade leve is: High school";
        } else if (gradelevel >= 13 && gradelevel <= 16) {
            result = "Grade leve is: College";
        } else if (gradelevel >= 17 && gradelevel <= 18) {
            result = "Grade leve is: Grad School";
        } else {
            result = "Grade leve is: Invalid";
        }
        System.out.println(result);
    }
}
/*
Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
(Only if the given number is a valid number, then print the school type.
Otherwise print Invalid)
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
 */