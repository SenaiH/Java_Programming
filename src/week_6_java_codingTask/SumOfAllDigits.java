package week_6_java_codingTask;

public class SumOfAllDigits {

    public static void main(String[] args) {
        System.out.println(sum("56gdht76"));
    }
public static int sum(String str){
        int result = 0;

    for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        if(Character.isDigit(ch)){
        result+=ch-'0';
    }
    }
   return result;
    }

}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */