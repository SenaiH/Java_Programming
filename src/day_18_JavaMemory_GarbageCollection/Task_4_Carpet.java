package day_18_JavaMemory_GarbageCollection;

public class Task_4_Carpet {
public double width,length,unitPrice;
public boolean isPersian=true;

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public String toString() {
        return "Task_4_Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
public double calCost() {
    double totalCost= (length * width) * unitPrice;
    if(isPersian){
        totalCost=totalCost+200;
    }
    return totalCost;
    }


    public static void main(String[] args) {
        Task_4_Carpet carpet1 = new Task_4_Carpet();
        carpet1.setInfo(10,15,20,true);
        System.out.println(carpet1);

        System.out.println(carpet1.calCost());

        Task_4_Carpet carpet2 = new Task_4_Carpet();
        carpet2.setInfo(10,15,20,false);
        System.out.println(carpet2);
        System.out.println(carpet2.calCost());
    }

}
/*
Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()


		    total price of carpet = (width*length) * unit-price

		    if the carpet is Persian  carpet, add 200$ to the totalPrice
 */