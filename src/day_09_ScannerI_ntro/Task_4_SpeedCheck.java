package day_09_ScannerI_ntro;

import java.util.Scanner;

public class Task_4_SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Allowed Speed Limit Vs Disallowed Speed Limit: ");
        int speedLimit = input.nextInt();
        String result = "";
        result=(speedLimit>=55)?"You're driving 50 mph over the limit. Slow down!":"You are a good driver";

        System.out.println(result);


    }


}
/*
Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
 */