package day_29_Inheritance.phoneTask;

public class Telephone {
private String brand,model,color;
private double price;
private char size;

    public void setInfo(String brand, String model, String color, double price, char size) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setPrice(price);
        setSize(size);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isBlank()||brand.isEmpty()||brand==null){
            System.err.println("Invalid brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty()||model.isBlank()||model==null){
            System.err.println("Invalid brand");
            System.exit(1);
        }

        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isBlank()||color.isEmpty()||color==null){
            System.err.println("Invalid Color");
            System.exit(1);
        }

        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if(price<0) {
           System.err.println("Invalid Price");
           System.exit(1);
       }

        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }


    public String toString() {
        return getClass().getSimpleName()+ " {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
public void call(long phoneNumber){
    System.out.println(phoneNumber + " is calling");
}
public void text(long phoneNumber){
    System.out.println(phoneNumber + " is texting");
}
}
/*
phoneTask
	1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement

	2. Create a class named Samsung:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Samsung" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString(): prints samsung object info when the object is passed in the print statement

	3. Create a class named Nokia:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Nokia" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString(): prints nokia object info when the object is passed in the print statement
 */