package day_33_Abstruction.animalTask;

public class Dog extends Animal {
    public Dog(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking");
    }
public void bark(){
    System.out.println(getName()+" is barking");
}
}
