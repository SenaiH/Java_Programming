package day_34_Interface.deviceTask;

public class Computer extends Device {
    public Computer(String brand, String model, String color, int price, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, price, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Computer is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is turning off");
    }
}
