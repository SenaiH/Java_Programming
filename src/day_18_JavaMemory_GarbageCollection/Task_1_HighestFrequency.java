package day_18_JavaMemory_GarbageCollection;

public class Task_1_HighestFrequency {
    public static void main(String[] args) {

      String str = "aaabbccccddeeee";
        int highestFrequency = 0;

        for (int j = 0; j <str.length() ; j++) {
               char ch = str.charAt(j);
               int count =0;
            for (int i = 0; i < str.length(); i++) {

                if(ch==str.charAt(i)){
                    count++;
                }

            }
        if(count>highestFrequency){
            highestFrequency=count;
        }
        }
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count == highestFrequency && !result.contains(ch + "")) {
                result += ch;
            }
        }

        System.out.println(result);
    }

}
/*
Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */