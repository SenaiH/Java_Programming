package day_06_IfStatements;

public class IsEvenlyDivisible {
    public static void main(String[] args) {
        int number = 75;

        boolean isEvenlyDivisibleBy2 = number%2==0;
        boolean isEvenlyDivisibleBy3 = number%3==0;
        boolean isEvenlyDivisibleBy5 = number%5==0;

        System.out.println(number + " is Evenly divisible by 2: " + isEvenlyDivisibleBy2);
        System.out.println(number + " is Evenly divisible by 3: " + isEvenlyDivisibleBy3);
        System.out.println(number + " is Evenly divisible by 5: " + isEvenlyDivisibleBy5);
    }


}
