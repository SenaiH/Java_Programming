package day_17_CustomClass;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "SUV";
        car1.year = 2023;
        car1.color = "Silver";
        car1.price =35_000;



        Car car2 = new Car();

        car2.make = "Honda";
        car2.model = "EV";
        car2.year = 2020;
        car2.color = "Black";
        car2.price=35_000;



        Car car3 = new Car();
        car3.SetInfo("GMC","Hybrid",2020,"Red",30_000);

        Car car4 = new Car();
        car4.SetInfo("Tesla","Model-3",2022,"Grey",50_000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
       car4.start();


    }


}
