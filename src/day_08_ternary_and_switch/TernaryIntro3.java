package day_08_ternary_and_switch;

public class TernaryIntro3 {
    public static void main(String[] args) {
        int score =70;
        String result = "";
        if(score>=0&&score<=100){
        if(score>=60){
            result = "Passed";
        }else {
            result = "Failed";
        }
        }else{
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("-----------------------------------");

   String result1 = (score>=0&&score<=100)?(score>=60)?"Passed":"Failed":"Invalid";
        System.out.println(result1);

        System.out.println("-------------------------------");

        int num =2;
        String day = (num>=1&&num<=7)?(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday"
           :(num==5)?"Friday":(num==6)?"Saturday": "Sunday":"Invalid";
        System.out.println(day);
    }

}
