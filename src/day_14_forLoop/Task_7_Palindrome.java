package day_14_forLoop;

public class Task_7_Palindrome {
    public static void main(String[] args) {

        String str1 = "able elba";
        String result = "";

        for (int i = str1.length()-1; i >=0 ; i--) {
           result+=str1.charAt(i);
        }
   boolean isPalindrom = str1.equalsIgnoreCase(result);
        System.out.println(isPalindrom);

    }

}
