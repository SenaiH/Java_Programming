package day_30_InheritanceContinue.deviceTask;

public class PC extends Computer {
    public PC( String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Personal Computer", model, color, size, price, hasBattery, hasPowerButton);
    }
}
