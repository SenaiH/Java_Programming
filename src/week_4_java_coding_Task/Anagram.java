package week_4_java_coding_Task;

public class Anagram {

    public static boolean same (String str,String str1){


        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str1.length(); j++) {
                char ch1 = str1.charAt(j);

                if(ch==ch1){
                    count++;
                    return true;
                }else{
                    return false;
                }
            }

        }
    return true;
    }

    public static void main(String[] args) {
        same("abc","cba");
    }

}
/*
String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
      same ("tea", "ate")
 */