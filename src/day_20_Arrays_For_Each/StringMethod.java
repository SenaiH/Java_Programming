package day_20_Arrays_For_Each;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[]ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("---------------------------------------");

        String str2 = "Today is a great day to learn Java";

        String[]words = str2.split(" ");
        // String[]words = str2.split("great"); [Today is a ,  day to learn Java]

        System.out.println(Arrays.toString(words));

        System.out.println("---------------------------------------");

        String sentence = "Today is a great day";
        String[]arr = ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(arr));

        String reversedSentence = "";

        for (int i = 0; i < arr.length; i++) {
            reversedSentence+=arr[i] + " ";
        }

        System.out.println(reversedSentence);
    }


}
