package day_6_IfStatements;

public class Task_4_PosNegZero {
    public static void main(String[] args) {

        int number = 0;

        String result = "";
        if (number > 0) {
            result = "Positive Number";
        }
        if (number < 0) {
            result = "Negative Number";
        }
        if (number == 0) {
            result = "Zero";
        }
        System.out.println(result);
    }

}
/*

2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive
 */