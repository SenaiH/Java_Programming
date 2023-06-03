package day_06_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 0;
        boolean isPositive = number>0;
        boolean isNegative = number<0;
        //boolean isZero= number==0;
        boolean isZero =!isPositive && isNegative;  // is number is!Positive and!Negative.

        System.out.println(number + " is a positive number: " + isPositive);
        System.out.println(number + " is a Negative number: " + isNegative);
        System.out.println(number + " is a Zero number: " + isZero);

        System.out.println("-------------------------------------------------------------");

        String result = (number>0)?"Is Positive":(number<0)?"Is Negative":"Is Zero";
        System.out.println(result);
    }


}
