package day_17_CustomClass;

public class Item {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setInfo("Laptop",30_000,10);

        System.out.println(item1);
        item1.calcCost();

        Item item2 = new Item();
        item2.setInfo("Car",60_000,100);

        System.out.println(item2);
        item2.calcCost();

    }

    public String name;
    public double unitPrice;
    public int quantity;

    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

    public void calcCost() {
        System.out.println("Total price of the item is: " + quantity * unitPrice);
    }

}
/*
Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in print statement, it should display the full information of the item object
 */