package day_6_IfStatements;

public class Task2_NumberToWord {
    public static void main(String[] args) {
      int num = 5;
      String result = "";
    if(num==0){
        result = "Zero";
    }if(num==1){
        result = "One";
        }if(num==2){
        result = "Two";
        }if(num==3){
        result = "Three";
        }if(num==4){
        result = "Four";
        }if(num==5){
        result = "Five";
        }if(num==6){
        result = "Six";
        }if(num==7){
        result = "Seven";
        }if(num==8){
        result="Eight";
        }if(num==9){
        result="Nine";
        }
        System.out.println(result);
    }
}
/*
Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */