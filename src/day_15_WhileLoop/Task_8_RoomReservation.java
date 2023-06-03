package day_15_WhileLoop;

import java.util.Scanner;

public class Task_8_RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cost = 0;
        System.out.println("Please select from listed : \nKing Bed =>$120\nQueen Bed=>$100\nSingle Bed=>$100");

        String order = input.nextLine().toLowerCase();

        while (!(order.equals("king bed") || order.equals("queen bed") || order.equals("single bed"))) {
            System.err.println("Invalid order: " + order + "\nPlease select a room");
            order = input.nextLine().toLowerCase();
        }
        if (order.equals("king bed")) {
            cost += 120;
        } else if (order.equals("queen bed")) {
            cost += 100;
        } else {
            cost = 80;
        }

        System.out.println("Your cost is $" + cost);

        input.close();
    }
}
/*
Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */