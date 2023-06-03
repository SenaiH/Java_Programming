package day_26_ConstruChainingStatics;

public class Person2 {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman,hasNose = true;
    public static boolean hasWing =false;
    public static int numberOfHead = 1;
    public static int numberOfEyes =2;

    public Person2(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
public void eat(String food){
    System.out.println(name + " eats "+ food);
}
public void drink1(String drink){
    System.out.println(name + " like to drink "+drink);
}
public void sleep(){
    System.out.println(name + " it is late go to sleep.");
}


    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}

/*
Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */