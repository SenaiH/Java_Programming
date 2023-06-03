package day_6_IfStatements;

public class IfAndElsePractice {
    public static void main(String[] args) {

 int score  = 101;

 if(score >=65){
     System.out.println("Passed");
 }else{
     System.out.println("Failed");
 }
        System.out.println("---------------------------------------");
 String result = (score >=65&&score<=100)?(score >=65)?"Passed":"Failed":"Invalid result";
        System.out.println(result);

    }
}
