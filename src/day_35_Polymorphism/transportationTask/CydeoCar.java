package day_35_Polymorphism.transportationTask;

import day_34_Interface.animalTask.Flyable;
import day_34_Interface.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric,AutoPilot, Swimmable {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

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
    public void charge() {

    }
}
