package week_05_java_codingTask;

public class Reverse {

    public static String reverse(String str){

        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);

        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }
}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */