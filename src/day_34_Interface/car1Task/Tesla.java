package day_34_Interface.car1Task;

public class Tesla extends Car1 implements AutoPark,AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " has an auto park system");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " is self driving");
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
