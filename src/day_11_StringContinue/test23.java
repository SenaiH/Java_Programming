package day_11_StringContinue;
import java.util.Scanner;
public class test23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter gift here: ");
        String gift = input.nextLine();

        int result = 60;
      
        switch (gift) {
            case "Blanket":
                result = 60;
                break;
            case "Charger":
                result = 5;
                break;
            case "Hat":
                result = 25;
                break;
            case "Headphones":
                result = 30;
                break;
            case "Laptop":
                result = 200;
                break;
            case "Pants":
                result = 50;
                break;
            case "Pillow":
                result = 40;
                break;
            case "Smartphone":
                result = 1000;
                break;
            case "Socks":
                result = 5;
                break;
            case "USB cable":
                result = 10;
                break;
            default:
                System.out.println("Sorry, that is an invalid item");
        }
        System.out.println("Your current balance is:" + result+"$");
    }
}