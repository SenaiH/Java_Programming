package day_8_ternary_and_switch;

public class Task_6_BiggerNum {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int num3 = 5;
        String result = "";
        result = (num1>num2&&num1>num3)?"num1 is bigger":(num2>num1&&num2>num3)?"num2 is bigger":(num3>num1&&num3>num2)?"num3 is bigger": "Invalid num";

        System.out.println(result);
    }


}
/*
Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

 */