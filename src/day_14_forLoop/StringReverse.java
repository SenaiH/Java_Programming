package day_14_forLoop;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Cydeo School Academy";
        String reversed = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        System.out.println(reversed);

        System.out.println("---------------------------------");

        String name = "Senai Haile";
       String result =  reverse(name);
        System.out.println(result);

    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }
}