package week_05_java_codingTask;

public class Unique {

    public static void main(String[] args) {

        String input = "AAABBBCCCDEF";

        for (int i = 0; i < input.length(); i++) {
            int unique = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j) && i != j) {
                    unique = 1;
                    break;
                }
            }
            if (unique == 0)
                System.out.print(input.charAt(i));
        }
    }

}



/*
String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */