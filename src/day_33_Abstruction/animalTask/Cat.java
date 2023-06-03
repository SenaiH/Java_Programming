package day_33_Abstruction.animalTask;

public class Cat extends Animal {
    public Cat(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking");
    }
public void scratch(){
    System.out.println(getName()+ " is scratching");
}
}
