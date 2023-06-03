package day_30_InheritanceContinue.deviceTask;

public class Phone extends Device {

    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
public void call(){
    System.out.println(getBrand() + " is calling");
}
public void text(){
    System.out.println(getBrand() + " is texting");
}
}
