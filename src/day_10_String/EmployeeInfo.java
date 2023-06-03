package day_10_String;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("Enter your gender: ");
        char gender = input.next().charAt(0);
        input.nextLine();

        System.out.println("Enter your Company name: ");
        String company = input.nextLine();

        System.out.println("Enter your Job title: ");
        String job = input.nextLine();

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.close();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("job = " + job);
        System.out.println("company = " + company);
        System.out.println("salary = " + salary);


    }

}
