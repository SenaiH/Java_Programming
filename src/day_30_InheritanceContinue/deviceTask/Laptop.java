package day_30_InheritanceContinue.deviceTask;

public class Laptop extends Computer {
    public Laptop( String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Laptop", model, color, size, price, hasBattery, hasPowerButton);
    }
}
