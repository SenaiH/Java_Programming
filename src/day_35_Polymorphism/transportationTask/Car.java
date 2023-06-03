package day_35_Polymorphism.transportationTask;

public abstract class Car extends Transportation {
    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
    public void drive(){
        System.out.println("Driving "+getMake()+" "+getModel());
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
