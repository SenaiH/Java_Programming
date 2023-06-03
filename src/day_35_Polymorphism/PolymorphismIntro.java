package day_35_Polymorphism;


import day_29_Inheritance.employeeTask.Developer;
import day_29_Inheritance.employeeTask.Driver;
import day_31_MethodOverriding.employeeTask.Teacher;
import day_31_MethodOverriding.shape_MethodOverriding.Circle;
import day_34_Interface.animalTask.*;
import day_34_Interface.car1Task.Audi;
import day_34_Interface.car1Task.Honda;
import day_34_Interface.car1Task.Tesla;

public class PolymorphismIntro {
    public static void main(String[] args) {
      Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");
      Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;


        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        /// Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.drink();
        animal.sleep();

        //  animal.play();
        //  animal.bark();

      System.out.println("---------------------------------------------------");

      String str = "Java";

      Integer n = 100;

      Boolean r = false;

      Double d = 10.5;

//      Circle circle = new Circle(4);
//
//      Honda honda = new Honda("Pilot", "Black", 2019, 35000);
//
//      Audi audi = new Audi("Q6", "Silver", 2020, 36000);
//
//      Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);
//
//      Teacher teacher = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);
//
//      Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
//
//      Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);
//
//      Tesla tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);
    }

}
