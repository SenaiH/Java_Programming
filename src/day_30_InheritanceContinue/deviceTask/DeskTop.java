package day_30_InheritanceContinue.deviceTask;

public class DeskTop extends Computer {
    public DeskTop( String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Desktop", model, color, size, price, hasBattery, hasPowerButton);
    }
}
