package day_33_Abstruction.animalTask;

public class TestAnimalObject {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty","Lol","White",'F','S',2);
        Dog dog = new Dog("Rayo","Huskey","Black",'F','L',6);
        Tiger tiger = new Tiger("Tiger","Tigron","Brown",'M','M',10);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(tiger);

        System.out.println("----------------------------");

        cat.scratch();
        cat.sleep();

        dog.eat();
        dog.bark();

        tiger.drink();
        tiger.hunt();

    }
}
