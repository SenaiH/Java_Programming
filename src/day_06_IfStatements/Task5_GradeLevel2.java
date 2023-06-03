package day_06_IfStatements;

public class Task5_GradeLevel2 {
    public static void main(String[] args) {
        int gradelevel = 17;
        String result = " ";

        if (gradelevel >= 1 && gradelevel <= 5) {
            result = "Elementary School";
        }
        if (gradelevel >= 6 && gradelevel <= 8) {
            result="Middle school";
        }
        if (gradelevel >= 9 && gradelevel <= 12) {
            result="High school";
        }
        if (gradelevel >= 13 && gradelevel <= 16) {
            result="College";
        }
        if (gradelevel >= 17 && gradelevel <= 18) {
            result="Grad School";
        }
        System.out.println(result);
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


