package day_10_String;

import java.util.Scanner;

public class StringMethod1 {
    public static void main(String[] args) {

        String str = "Cydeo";
        char firstChar = str.charAt(0);
        char second = str.charAt(1);
        char third = str.charAt(2);
        char fourth = str.charAt(3);
        char fifth = str.charAt(4);

        // char sixth =str.charAt(5); ==> prints error.


        System.out.println("firstChar = " + firstChar);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        System.out.println("fourth = " + fourth);
        System.out.println("fifth = " + fifth);

        System.out.println("-----------------------------------------------");

        String sentence = "Java Programming Language";

        int length = sentence.length();
        int lastIndex = sentence.length()-1;

        System.out.println(sentence.length());
        System.out.println(length);
        System.out.println(lastIndex);

        System.out.println("-----------------------------------");

        String str1 = "Wooden Spoon";
        char first = str1.charAt(0);
        int last = str1.length()-1;
        char l= str1.charAt(last);

        System.out.println(first);
        System.out.println(l);
        System.out.println("first = " + first);
        System.out.println("l = " + l);
        System.out.println(first+" :"+l);

        System.out.println("__________________________________");

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

        System.out.println("------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1==r2);
        System.out.println(r2==r3);
        System.out.println(r1==r3);

        System.out.println(r1.equals(r2));
        System.out.println(r2.equals(r3));
        System.out.println(r1.equals(r3));

        String str8 = "Cydeo";
        char f = str.charAt(str.length()-1);
        System.out.println("f = " + f);

        System.out.println("----------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Are you a US Citzen? Yes/No");
        String answer = input.next();

        if(age>=21&&answer.equals("Yes")) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");

            input.close();
        }
    }

}
