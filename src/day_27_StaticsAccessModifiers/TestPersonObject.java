package day_27_StaticsAccessModifiers;

import org.w3c.dom.ls.LSOutput;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Senai", "Tigrigna", 36,  'M');

        System.out.println(person);
        person.eat("Steak");
        person.drink("Juice");

        Person.printPlanetName();

        System.out.println(Person.isHuman);
        System.out.println(Person.hasNoNose);
        System.out.println(Person.numberOfHeads);

    }
}
