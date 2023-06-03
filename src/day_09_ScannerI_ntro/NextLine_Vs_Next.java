package day_09_ScannerI_ntro;

import java.util.Scanner;

public class NextLine_Vs_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age here: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter full name: ");
        String name = input.nextLine();
        System.out.println("age = " + age);
        System.out.println("name = " + name);

    }

}
