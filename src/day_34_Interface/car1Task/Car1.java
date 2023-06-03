package day_34_Interface.car1Task;

public abstract class Car1 {
private  String make, model;
private int year;
private double price;
private String color;

    public Car1(String make, String model, int year, double price, String color) {
        setMake(make);
        setModel(model);
        setYear(year);
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        if(make==null){
            System.out.println("Invalid make");
            System.exit(1);
        }
        return make;
    }

    public void setMake(String make) {
        if(make.isEmpty()){
            System.out.println("Invalid make");
            System.exit(1);
        }
        this.make = make;
    }

    public String getModel() {
        if(model==null){
            System.out.println("Invalid Model");
            System.exit(1);
        }

        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty()){
            System.out.println("Invalid color");
            System.exit(1);
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<1886){
            System.out.println("Invalid year");
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        if(color==null){
            System.out.println("Invalid color");
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("Invalid color");
            System.exit(1);
        }

        this.color = color;
    }
   public abstract void start();
    public abstract void drive();

    protected final void stop(){
        System.out.println(make + " is stopping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using extend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a sub class of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */