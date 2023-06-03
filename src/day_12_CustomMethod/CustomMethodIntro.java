package day_12_CustomMethod;

import Week1_Java_Coding.Identify;

public class CustomMethodIntro {
    public static void main(String[] args) {

        System.out.println("Test started");

        greetings();

        System.out.println("Test completed");

        System.out.println("---------------------");

        displayMessage();

        System.out.println("-------------------------------");

        Identify.identify(9);



    }

    public static void greetings() {
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
    }
        public static void displayMessage() {
            System.out.println("Hello world");
            System.out.println("I love Java");

        }


}
