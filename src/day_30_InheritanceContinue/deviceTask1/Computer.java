package day_30_InheritanceContinue.deviceTask1;

public class Computer extends Device {
private String name;

    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, String name) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void myName(){
    System.out.println(name + " is my name");
}

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                "name='" + name + '\'' +
                '}';
    }
}
