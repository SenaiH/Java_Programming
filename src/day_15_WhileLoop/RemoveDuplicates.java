package day_15_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str ="aaaabbbccccddd";
        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            char each = str.charAt(i);

            if(!result.contains(""+ each)){
             result+=each;
        }

        }
        System.out.println(result);

        }
    }



/*
 Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */