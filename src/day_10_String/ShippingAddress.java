package day_10_String;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNum = input.next();

        input.nextLine();

        System.out.println("Enter your street name:");
        String street = input.nextLine();

        System.out.println("Enter your city name:");
        String city = input.nextLine();

        System.out.println("Enter state name:");
        String state = input.nextLine();

        System.out.println("Enter Zip code");
        int zip = input.nextInt();

        input.close();

        System.out.println("Your Shipping Address is:");
        System.out.println("\t\t\t\t\t"+name);
        System.out.println("\t\t\t\t\t"+buildingNum +","+street);
        System.out.println("\t\t\t\t\t"+city+" "+state);
        System.out.println("\t\t\t\t\t"+zip);

    }

}
