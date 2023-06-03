package day_18_JavaMemory_GarbageCollection;

import day_17_CustomClass.Dog;

public class GrabageCollection {
    public static void main(String[] args) {

        // new GarbageCollection().finalize();

        String s1 = "Java";
        s1 = null; // "Java" will be eligible for garbage collection

        System.out.println(s1);

        //  System.out.println(s1.toUpperCase());

        //  System.out.println( s1.replace(null, "Python"));

        String a = "";   // is an object.
        String b = null;  // is nothing.

        System.out.println("-------------------------------------------");

        String str1 = "Python"; //"Python" will be eligible for garbage collection
        str1 = "CYDEO";

        System.out.println(str1);


        System.out.println("-------------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "Black");

        //dog1 = null;  will be eligible for garbage collection

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);


        // new Dog().finalize(); is called by garbage collector.



    }

}
