package day_07_IfStatement;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = -90;

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid Result");
        }
        System.out.println("------------------------------");

        int age = 101;

        if (age >= 1 && age <= 100) {
            if (age >= 21) {
                System.out.println("Eligible to drink alcohol");
            } else {
                System.out.println("Not Eligible to drink alcohol");
            }
        }else {
            System.out.println("Invalid answer");
        }

        System.out.println("-------------------");

        int day = 100;
        if(day==1&&day<=7){
            if(day==1){
                System.out.println("Monday");
            }else if(day==2){
                System.out.println("Tuesday");
            }else if(day==3){
                System.out.println("Wednesday");
            }else if(day==4){
                System.out.println("Thursday");
            }else if(day==5){
                System.out.println("Friday");
            }else if(day==6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }
        }else{
            System.out.println("Invalid day!");
        }
    }

}
