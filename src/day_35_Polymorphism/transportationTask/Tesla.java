package day_35_Polymorphism.transportationTask;

public class Tesla extends Car implements Electric, AutoPark,AutoPilot{
    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void transportPeople() {
        super.transportPeople();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void charge() {

    }
}
