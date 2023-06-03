package day_14_forLoop;

public class Task_6 {
    public static void main(String[] args) {

        String input = "1h2g7yhg8";
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char num = input.charAt(i);

            if (num >= '0' && num <= '9') {
                int number =num-'0';
                sum += number;

            }
        }
        System.out.println(sum);
    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */