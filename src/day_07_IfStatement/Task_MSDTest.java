package day_07_IfStatement;

public class Task_MSDTest {
    public static void main(String[] args) {
     int num=8;
     String result ="";

     if(num>=1&&num<=100){
         if(num%3==0&&num%7==0){
             result="Awesome and Excellent ";
         }else if(num%3==0){
             result="Awesome";
         }else if(num%7==0){
             result="Excellent";
         }else{
             result="Invalid00000";
         }
     }else{
         result="Invalid";
     }
        System.out.println(result);
    }


}
/*
Write a program that outputs all the numbers from 100 down to 1 (do not output zero). If a number is a multiple of 3 it should output the number and “Awesome”, if a number is a multiple of 7 it should output the number and “Excellent”. When a number is a multiple of both 3 and 7 it should output the number and both “Awesome” and “Excellent”.
 */