package day_30_InheritanceContinue.deviceTask;

public class SmartTV extends TV {
    public SmartTV(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("SmartTV", model, color, size, price, hasBattery, hasPowerButton);
    }
}
