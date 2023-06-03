package day_09_ScannerI_ntro;

import java.util.Scanner;

public class Task_7_PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter product name: ");
        String product = input.nextLine();

        System.out.println("Enter Price:  ");
        double price = input.nextDouble();

        System.out.println("Enter Quantity: ");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter first name: ");
        String firstName = input.next();

        input.close();

        System.out.println("Input: "+product+","+price+","+quantity+"."+firstName);

        System.out.println(firstName+","+" your order for "+quantity+" "+ product+" has been placed. Your total is "+price+"$.");

    }

}
/*
Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */