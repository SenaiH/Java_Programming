package day_06_IfStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {
 int number = 155;
  boolean isOdd = number%2 != 0;
  boolean isEven=!isOdd;

if(isOdd){
    System.out.println(number + " is Odd number");
}if(isEven){
            System.out.println(number + " is Even number.");
        }

        System.out.println("--------------------------------------");
if(number/2==0){
    System.out.println(number + " is even number");
}if(number/2!=0){
            System.out.println(number + " is odd number");
        }

    }
}
