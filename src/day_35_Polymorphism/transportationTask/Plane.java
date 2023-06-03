package day_35_Polymorphism.transportationTask;

import day_34_Interface.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel() +" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" is flying");
    }
}
