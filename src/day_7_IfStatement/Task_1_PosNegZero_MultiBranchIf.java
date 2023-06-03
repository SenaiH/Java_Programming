package day_7_IfStatement;

public class Task_1_PosNegZero_MultiBranchIf {
    public static void main(String[] args) {
        int num = 100;

 if(num>0){
     System.out.println("Positive");
 }if(num<0){
            System.out.println("Negative");
        }if(num==0){
            System.out.println("Zero");

        }

        System.out.println("----------------------------------");

 String result = "";

 if(num>0){
     result = "Positive";
 }else if(num<0){
     result = "Negative";
 }else{
     result = "Zero";
 }
        System.out.println(result);
    }


}
