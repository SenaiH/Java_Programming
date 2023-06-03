package day_26_ConstruChainingStatics;

import day_17_CustomClass.Car;

public class TestCarObjects {
    public static void main(String[] args) {

        Car1 car1 = new Car1("BMW");

        System.out.println(car1);


        Car1 car2 = new Car1("Audi", "Q4");

        System.out.println(car2);


        Car1 car3 = new Car1("Toyota", "Camry", 2021);

        System.out.println(car3);


        Car1 car4 = new Car1("Honda", "Accord", 2020, 30000);

        System.out.println(car4);


        Car1 car5 = new Car1("Lexus", "RX350", 2019, 40000, "Black");

        System.out.println(car5);


    }

}
