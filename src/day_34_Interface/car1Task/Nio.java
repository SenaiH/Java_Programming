package day_34_Interface.car1Task;

public class Nio extends Car1 implements AutoPilot,AutoPark{
    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " has an autopark system");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " is self driving car");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " is comfortable");
    }
}
