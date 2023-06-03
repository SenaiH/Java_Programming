package day_14_forLoop;

public class testReverseString {
    public static void main(String[] args) {

        String result="Senait";
        String reverse = "";

        for (int i = result.length()-1; i >=0 ; i--) {
            reverse+=result.charAt(i);
        }
        System.out.println(reverse);

 String str = "Senai";
 String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);

 boolean isPalindrome = str.equalsIgnoreCase(reversed);
        System.out.println(isPalindrome);
    }

}
