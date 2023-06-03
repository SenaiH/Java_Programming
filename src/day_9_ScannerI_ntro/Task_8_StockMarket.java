package day_9_ScannerI_ntro;

import java.util.Scanner;

public class Task_8_StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many total shares you have? ");
        int shares = input.nextInt();

        System.out.println("Value of Stock");
        double stockValue = input.nextDouble();

        System.out.println("Company name with most shares");
        String mostShares = input.nextLine();
        input.nextLine();

        System.out.println("Inputs: "+shares+" "+stockValue+" "+mostShares);

        System.out.println("Your total stock market holding is "+ stockValue +" which is made up of "+ shares +" shares. "+mostShares+ " is your company holdings");


    }

}
/*
Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */