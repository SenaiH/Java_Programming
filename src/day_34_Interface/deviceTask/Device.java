package day_34_Interface.deviceTask;

public abstract class Device {
private  String brand,model,color;
private int price;
private char size;
private boolean hasBattery,hasPowerButton;

    public Device(String brand, String model, String color, int price, char size, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setPrice(price);
        setSize(size);
        setHasPowerButton(hasPowerButton);
        setHasBatter(hasBattery);
    }

    public String getBrand() {
        if(brand==null){
            System.out.println("Invalid Brand");
            System.exit(1);
        }

        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty()){
            System.out.println("Invalid Brand");
            System.exit(1);
        }
        this.brand = brand;
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
            System.out.println("Invalid Model");
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
       if(color==null){
           System.out.println("Invalid Color");
           System.exit(1);
       }
        return color;
    }

    public void setColor(String color) {
       if(color.isEmpty()){
           System.out.println("Invalid Color");
           System.exit(1);
       }
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<0){
            System.out.println("Invalid Price");
            System.exit(1);
        }
        this.price = price;
    }

    public char getSize() {
       if(size==0){
           System.out.println("Invalid Size");
           System.exit(1);
       }
        return size;
    }

    public void setSize(char size) {
        if(size==0){
            System.out.println("Invalid Size");
            System.exit(1);
        }
        this.size = size;
    }

    public boolean isHasBatter() {
        return hasBattery;
    }

    public void setHasBatter(boolean hasBatter) {
        this.hasBattery = hasBatter;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}

/*
Device Task:
	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price


	2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()


	3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed

	4. Create an interface named downloadable:

				Abstract method:
					downloadApp();

	5. Create a child interface of Downloadable named AndroidApps:
			Variables:
				AppStoreName, OS

	6. Create a child interface of Downloadable named AppleApps

			Variables:
				AppStoreName, OS


	7. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces

				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces


	8. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop


	9. Create a class named DeviceShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */