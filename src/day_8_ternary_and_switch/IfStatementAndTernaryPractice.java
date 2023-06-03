package day_8_ternary_and_switch;

public class IfStatementAndTernaryPractice {
    public static void main(String[] args) {
        int score = -69;
        String result = "";
        if(score>=0&&score<=100) {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        } else{
            result = "Invalid";
        }
        System.out.println(result);

        System.out.println("------------------------------------");


        int score1 = -11;
        String result1 = "";
       result1 =  (score1>=0&&score1<=100)?(score1 >= 90&&score1<100) ? "A" : (score1 >= 80&&score1<90) ? "B" : (score1 >= 70&&score1<80) ? "C" : (score1 >= 60&&score1<70) ? "D" : "F":" Invalid";
        System.out.println(result1);
    }

}
