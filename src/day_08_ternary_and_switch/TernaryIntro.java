package day_08_ternary_and_switch;

public class TernaryIntro {
    public static void main(String[] args) {
        int score = 85;

        String result ="";

        if(score>=60){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);
        System.out.println("------------------------------------");
        result = score>=60?"Passed":"Failed";   //(score>=60)?"Passed":"Failed";
        System.out.println(result);

        System.out.println("-------------------------------");
      int age = 14;
      String result1 = "";
      if(age>21){
          result1 = "Eligible";
      }else{
          result1 = "Not Eligible";
      }
        System.out.println(result1);
        System.out.println("________________________________");

        String result3 =age>21?"Eligible":"Not Eligible";

        System.out.println(result3);
    }

}
