package day_27_StaticsAccessModifiers;

public class Dog {
public String breed,color;
public char size,gender;
public int age;
public boolean isFriendly;

public static int numberOfLegs,numberOfEyes;
public static String numberOfWings;

    public Dog(String breed, String color, char size, char gender, int age, boolean isFriendly) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }
static {
      numberOfEyes = 2;
      numberOfLegs = 4;
      numberOfWings = "No Wings";

}
public void eat(){
    System.out.println(breed + " likes to eat chicken.");
}
public  void drink(){
    System.out.println(breed + " likes to drink beef soup");
}
public static void legs(){
    System.out.println("Our dog has " + numberOfLegs + " legs.");
}
public void sleep(){
    System.out.println(breed + " sleeps a lot");
}
public void play(){
    System.out.println(breed + " plays a lot.");
}
    public void bark(){
        System.out.println(breed + " barks a lot.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
/*
Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */