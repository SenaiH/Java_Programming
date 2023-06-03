package day_6_IfStatements;

public class IfStatetmentIntro {
    public static void main(String[] args) {
        int number = -100;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if (isPositive) {
            System.out.println(number + " is Positive Number: " + isPositive);
        }
        if (isNegative) {
            //else if (isNegative)
            System.out.println(number + " is Negative Number: " + isNegative);
        }
        if (isZero) {
            System.out.println(number + " is Zero Number: " + isZero);

            //else{
            //   System.out.println(number + " is Zero Number: " + isZero);
        }

        System.out.println("------------------------------------");
        int num = 100;

        if (num > 0) {
            System.out.println(num + " :is positive number.");
        }
        if (num < 0) {
            System.out.println(num + " :is negative number.");
        }
        if (num == 0) {
            System.out.println(num + " :is zero number.");
        }
    }

}
//System.out.println(number + " is Positive Number: " + isPositive);