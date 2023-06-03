package day_15_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age here:   ");
        int age =  input.nextInt();

        while (!(age>=1&&age<=150)){
            System.err.println("Invalid Entry,Please re-enter your age:  ");
              age = input.nextInt();
        }

   if(age>=21){
       System.out.println("Eligible");
   }else{
       System.out.println("Not eligible");
   }
input.close();
    }

}
