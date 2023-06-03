package day_09_ScannerI_ntro;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullname = input.nextLine();
        //input.nextLine();

        System.out.println("Enter school name");
        String school = input.nextLine();

        System.out.println("Enter gender: ");
        String gender = input.next();

        System.out.println("Enter age: ");
        int age = input.nextInt();

        input.nextLine(); // We have extra next line method if we are using single next line method after other methods of
                            // Scanner, so that to clear out the Scanner.

        System.out.println("What is your home address");
        String home = input.nextLine();

        System.out.println("fullname = " + fullname);
        System.out.println("school = " + school);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("home = " + home);
    }

}
