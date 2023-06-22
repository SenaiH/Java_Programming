package week_4_java_coding_Task;

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
String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */