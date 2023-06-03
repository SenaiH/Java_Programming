package day_07_IfStatement;

public class Task_4_Grade {
    public static void main(String[] args) {
      char grade = 'G';
      String result ="";
      if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F'){
          if(grade=='A'){
              result = "A: Excellent";
          }else if(grade=='B'){
              result = "B: Great Job";
          }else if(grade=='C'){
              result ="C: Good";
          }else if(grade=='D'){
              result ="D: Passed";
          }else{
              result = "F: Failed";
          }
      }else{
          result = "Invalid Result!";
      }
        System.out.println(result);
    }
}
/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */