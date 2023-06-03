package trail_and_error;

public class Test_ReverseDigit {
    public static void main(String[] args) {

     String num = "123456";
     String reversed = "";

        for (int i = num.length()-1; i >=0 ; i--) {
            reversed+=num.charAt(i);
        }
        System.out.println(reversed);
    }

}
/*
Write a function, reverseDigits, that takes an integer parameter and then returns the number
with the digits reversed.
E.g.,
reverseDigits(1234) returns 4321
 */