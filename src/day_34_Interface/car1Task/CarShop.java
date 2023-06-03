package day_34_Interface.car1Task;

public class CarShop {
    public static void main(String[] args) {
        Audi audi = new Audi("Audi","VFR",2020,120000,"Blue");
        BMW bmw = new BMW("BMW","GHT",2022,100000,"Black");
        CydeoCar cydeoCar = new CydeoCar("CydeoCar","GTU",2023,80000,"Red");
        Honda honda = new Honda("Honda","ADT",2020,80000,"Silver");
        Mercedes mercedes = new Mercedes("Mercedes","ADP",2021,70000,"Green");
        Nio nio = new Nio("Nio","HUY",2022,125000,"White");
        Tesla tesla = new Tesla("Tesla","Model-3",2017,65000,"Black");
        Toyota toyota = new Toyota("Toyota","CAD",2015,50000,"White");

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(cydeoCar);
        System.out.println(honda);
        System.out.println(mercedes);
        System.out.println(nio);
        System.out.println(tesla);
        System.out.println(toyota);

        System.out.println("-------------------------------------------------");

        audi.autoPark();
        bmw.drive();
        cydeoCar.fly();
        honda.start();
        mercedes.start();
        nio.selfDrive();
        nio.stop();
        tesla.autoPark();
        toyota.stop();

    }
}
