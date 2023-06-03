package day_27_StaticsAccessModifiers;

public class TestDogObject {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky","Brown",'M','F',10,true);

        System.out.println(dog);

        dog.eat();
        dog.drink();
        dog.bark();
        dog.sleep();
        dog.play();

        Dog.legs();
        System.out.println(Dog.numberOfEyes);
        System.out.println(Dog.numberOfWings);


    }

}
