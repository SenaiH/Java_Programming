package day_34_Interface.deviceTask;

public class Iphone extends Phone implements Downloadable,AppleApps {
    public Iphone(String brand, String model, String color, int price, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, price, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " is downloading");
    }

}
