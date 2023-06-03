package day_11_StringContinue;

import java.util.Scanner;

public class Task_5_CombineWords {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.nextLine();

        System.out.println("Enter second word");
        String word2 = input.nextLine();

        String result = " ";

        if(word1.charAt(word1.length()-1)==(word2.charAt(0))){
            result=word1+word2.substring(1);
        }else{
            result=word1+word2;
        }

        System.out.println(result);
    }

}
/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter 0f the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */