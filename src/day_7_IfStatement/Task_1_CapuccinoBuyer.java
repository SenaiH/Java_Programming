package day_7_IfStatement;

public class Task_1_CapuccinoBuyer {
    public static void main(String[] args) {
       String size = "ventti";
       if(size=="tall"||size=="grande"||size=="ventti"){
           if(size=="tall"){
               System.out.println("Price is $3.69\n90 calories.");
           }else if(size=="grande"){
               System.out.println("Price is $3.99\n120 calories.");
           }else{
               System.out.println("Price is $4.69\n150 calories.");
           }
       }else{
           System.out.println("Invalid size");
       }
    }

}
/*
 Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if
 */