package day_33_Abstruction.animalTask;

public abstract class Animal {
private String name,breed,color;
private char gender,size;
private int age;

    public Animal(String name, String breed, String color, char gender, char size, int age) {
        setAge(age);
        setBreed(breed);
        setColor(color);
        setGender(gender);
        setSize(size);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void drink();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
/*
        0. Animal
        attributes:
        name, breed, gender, size, color, age
        methods:
        setInfo(), eat(), sleep(), drink(), toString()
        */