package Utilities;

public class StringUtility {
    public static String reverse(String str) {
        String reverse = "";  // to contain all the characters of the given String in a reversed order.
        for (int i = str.length() - 1; i >= 0; i--) { // i= index number of the given string(last to 0 index)
            reverse += str.charAt(i);

        }
        return reverse;
    }
}
