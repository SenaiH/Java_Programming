package day_27_StaticsAccessModifiers;

public class Person {
public String name,language;
public int age;
public char gender;

public static String Planet;
public static boolean isHuman,hasNoNose;
public static int numberOfHeads,numberOfWings;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }
static {
        Planet = "Earth";
        isHuman = true;
        hasNoNose = false;
        numberOfHeads = 1;
        numberOfWings = 0;

}
public static void printPlanetName(){
    System.out.println(Planet);
}
public void eat (String food){
    System.out.println(name + " likes "+ food);
}
public void drink(String drink){
    System.out.println(name + " likes "+ drink);
}


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", numberOfWings='" + numberOfWings + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */