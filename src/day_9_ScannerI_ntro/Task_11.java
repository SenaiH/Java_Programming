package day_9_ScannerI_ntro;


import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Your gender: ");
         String gender = input.next();

         input.nextLine();

        System.out.println("full name:");
        String fullname = input.nextLine();

        System.out.println("Phone Number: ");
        long phonenumber = input.nextLong();

        System.out.println("Zip Code: ");
         int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("School Name: ");
        String schoolname = input.nextLine();

        System.out.println("City Name: ");
        String city = input.nextLine();

        System.out.println("State Name: ");
        String state = input.next();

        System.out.println("Buliding number: ");
        int building = input.nextInt();

        input.nextLine();

        System.out.println("Street Name: ");
        String streetName = input.nextLine();

        input.close();

        System.out.println("fullname = " + fullname);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phonenumber = " + phonenumber);
        System.out.println("Address:");
        System.out.println("\t\t\t\t"+building+", "+streetName);
        System.out.println("\t\t\t\t"+city+","+state+" "+zipCode);
        System.out.println("schoolname = " + schoolname);


    }

}
/*
Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in sperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name

 */