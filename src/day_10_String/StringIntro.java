package day_10_String;
import java.lang.String;
import java.lang.System;
public class StringIntro {
    public static void main(String[] args) {

       // Scanner input = new Scanner();
        String str = "Java";
        System.out.println();

        System.out.println("----------------------");

        String s1 ="Cat";
        String s2 ="Dog";
        String s3 ="Cat";
        String s4 ="Cat";

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println("----------------------");

        String str1 = new String("Java");// Creates two object 1.String Pool 2. Heap Memory( Outside String)
        String str2 = new String("Java");

        System.out.println(str1==str2);

        System.out.println("----------------------");

        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1==t2);
        System.out.println(t2==t3);
        System.out.println(t1==t3);


    }

}
