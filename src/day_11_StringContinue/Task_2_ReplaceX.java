package day_11_StringContinue;

import java.util.Scanner;

public class Task_2_ReplaceX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = input.nextLine();

       word= word.toLowerCase().replace("x","a");//=====> Correct option.
        System.out.println(word);



        //word= word.replace('x','a').replace('X','a');



    }
}
/*
Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */