package day_27_StaticsAccessModifiers;

import javax.swing.plaf.PanelUI;

public class Iphone {
    public String model;
    public int size;
    public String color;
    public String OS;
    public double price;

    public static String brand;
    public static String madeIn;
    public static String designIn;
    public static boolean isSmartPhone;

    public Iphone(String model, int size, String color, String OS, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.OS = OS;
        this.price = price;

    }

    static {

        brand = "Apple";
        madeIn = "Chine";
        designIn = "USA";
        isSmartPhone = true;

    }

    public void printOperatingSystem() {
        System.out.println("Operating System: " + OS);
    }

    public void call(long phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    public void text(long phoneNumber) {
        System.out.println("Sending text to " + phoneNumber + "...");
    }

    public void faceTime(long phoneNumber) {
        System.out.println("Starting FaceTime call with " + phoneNumber + "...");
    }

    public void faceTime(String email) {
        System.out.println("Starting FaceTime call with " + email + "...");
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", OS='" + OS + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */