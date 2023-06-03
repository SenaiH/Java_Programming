package day_34_Interface.deviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, String color, int price, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, price, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
