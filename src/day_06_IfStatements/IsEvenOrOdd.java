package day_06_IfStatements;

public class IsEvenOrOdd {
    public static void main(String[] args) {

      int number=20;
      boolean isEven=number%2==0;  // when we divide a number if the reminder is 0 , it is an even number.
      boolean isOdd=number%2==1;   // when we divide a number if the reminder is not 0 , it is an odd number.
// boolean isOdd=!isEven;
        System.out.println("isOdd = " + isOdd);
        System.out.println("isEven = " + isEven);
        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);

    }


}
