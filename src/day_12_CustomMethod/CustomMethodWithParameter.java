package day_12_CustomMethod;

public class CustomMethodWithParameter {
    public static void main(String[] args) {

        evenOrOdd(6);
        evenOrOdd(7);
        evenOrOdd(9);
        evenOrOdd(8);
        System.out.println("------------------------");
        Eligible(30);
        Eligible(15);
        Eligible(101);
        System.out.println("------------------------");
        evenOddOrZero(4);
        evenOddOrZero(7);
        evenOddOrZero(0);
        System.out.println("------------------------");
        grade(80);
        grade(101);
        grade(50);
        grade(690);
    }


    public static void evenOrOdd(int num) {
      if(num%2==0){
          System.out.println("Num is Even");
      }else {
          System.out.println("Num is Odd");
      }
    }

    // Craete a method if a person is eligible to buy alcohol.
    public static void Eligible(int age){
        if(age>=0&&age<=100){
            if(age>=21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        }else{
            System.out.println("Invalid age");
        }

    }

    // Create a method if a number is even,odd or zero.
    public static void evenOddOrZero(int number){
        if(number%2==0){
            System.out.println("Number is even");
        }else if((number&2)!=0){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is odd");
        }
    }

    // Create a method that calculates the grade of students.

    public static void grade (int score){
        if(score>=0&&score<=100){
            if(score>=90){
                System.out.println('A');
            }else if(score>=80&&score<90){
                System.out.println('B');
            }else if(score>=70&&score<80){
                System.out.println('C');
            }else{
                System.out.println('D');
            }
        }else{
            System.out.println("Invalid grade");
        }
    }

}
