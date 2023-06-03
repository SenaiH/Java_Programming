package day_35_Polymorphism.transportationTask;

public class Audi extends Car implements AutoPark {
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {

    }
}
