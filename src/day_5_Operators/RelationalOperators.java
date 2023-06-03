package day_5_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 200;
        int b = 1000;

        boolean aIsGreater = a>b;
        System.out.println(aIsGreater);

        System.out.println("________________________________");

        int score =60;

        boolean isPassed = score>=75;

        System.out.println(isPassed);

        System.out.println("------------------------");

        int age = 21;
        boolean isEligibleToBuyAlcohol = age>21;
        System.out.println(isEligibleToBuyAlcohol);

        boolean isEligibleToVote=age>18;

        System.out.println(isEligibleToVote);

        score = 48;

        boolean failed = score <=50;
        System.out.println(failed);

        System.out.println("________________________________");

        System.out.println('a'>'b'); // we can compare chars with relational operators.
       // System.out.println("Java" > "JavaScript"); we can;t compare strings with relational operators.

    }

}
