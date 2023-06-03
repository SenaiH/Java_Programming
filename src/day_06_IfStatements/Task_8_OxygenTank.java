package day_06_IfStatements;

public class Task_8_OxygenTank {
    public static void main(String[] args) {
       int OxygenTank = 50;
    String result = "";
       if(OxygenTank>=90){
           result = "Your tank is full";
       }if(OxygenTank<90&&OxygenTank>=80){
           result = "Still okay";
        }if(OxygenTank<80&&OxygenTank>=70){
           result = "Don't go too far";
        }if(OxygenTank<70&&OxygenTank>=60){
           result = "Start to head back";
        }if(OxygenTank<60&&OxygenTank>=50){
           result = "Be careful now you are at 50%";
        }
        System.out.println(result);
    }

}
/*
Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%
 */