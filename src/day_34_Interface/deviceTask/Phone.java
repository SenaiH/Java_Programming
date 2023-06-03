package day_34_Interface.deviceTask;

public class Phone extends Device {
    public Phone(String brand, String model, String color, int price, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, price, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(" Phone is turning off");
    }
public void call(long phoneNum){
    System.out.println(phoneNum + " is calling");
}
public void text(long phoneNum){
    System.out.println(phoneNum + " is texting");
}

}
