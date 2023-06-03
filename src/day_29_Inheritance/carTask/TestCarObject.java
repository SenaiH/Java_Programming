package day_29_Inheritance.carTask;

public class TestCarObject {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.setInfo("Audi","DFRE435","Blue",2020,100_000);
        System.out.println(audi);
        audi.setColor("Red");
        System.out.println(audi);

        BMW bmw = new BMW();
        bmw.setInfo("BMW","DGTR54","White",2022,75_000);
        System.out.println(bmw);
        bmw.setModel("GTR43");
        System.out.println(bmw);

        Honda honda = new Honda();
        honda.setInfo("Honda","DRY76","Yellow",2021,78_000);
        System.out.println(honda);
        honda.setYear(2023);
        System.out.println(honda);

        Toyota toyota = new Toyota();
        toyota.setInfo("Toyota","GRT45","Green",1990,3_000);
        System.out.println(toyota);
        toyota.setYear(2022);
        toyota.setPrice(150_000);
        System.out.println(toyota);

        Volvo volvo = new Volvo();
        volvo.setInfo("Volvo","HUYT23","Silver",2020,150_000);
        System.out.println(volvo);
        volvo.setModel("UBER6");
        System.out.println(volvo);
    }
}
