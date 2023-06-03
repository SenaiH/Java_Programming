package day_34_Interface.deviceTask;

public class PC extends Computer{
    public PC(String brand, String model, String color, int price, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, price, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is turning off");
    }
}
