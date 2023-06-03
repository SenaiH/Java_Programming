package day_34_Interface.car1Task;

public class CydeoCar extends Car1 implements AutoPilot,AutoPark,Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " has autopark system");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " has slefdriving system");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " is comfortable");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " has a fly option button");
    }
}
