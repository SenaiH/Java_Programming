package day_16_DoWhile_NestedLoop;

public class Task7_FrequencyOfChars {
    public static void main(String[] args) {

        String str = "ghfdrdggfgff";
        String result = ""; //g4h1f4d2r1     g4h1f4d2r1

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if(ch == each){

                    count++;
                }
            }

            if(result.contains(""+ch)){
               continue;
            }

            result += ch;
            result += count;
        }
        System.out.println(result);
    }
}
/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */