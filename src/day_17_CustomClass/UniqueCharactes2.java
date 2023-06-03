package day_17_CustomClass;

public class UniqueCharactes2 {
    public static void main(String[] args) {
        String str = "aaabbbbcd";
        String unique = " ";

        for (int j = 0; j < str.length(); j++) {

            int frequency = 0;
            char ch = str.charAt(j);

            for (int i = 0; i < str.length(); i++) {// checks how many times the ch has appeared in str.
                if (str.charAt(i) == ch) {//if the ch has appeared in the string
                    frequency++; // increase the frequency by 1
                }
            }
            if (frequency == 1) {  // if frequency is one, then it is unique character.
                unique += ch;
            }
        }
        System.out.println(unique);
        }

    }
/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */