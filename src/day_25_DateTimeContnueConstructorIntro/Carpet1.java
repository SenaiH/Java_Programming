package day_25_DateTimeContnueConstructorIntro;

public class Carpet1 {
public int width, length;
public double unitPrice;
public boolean isPersian;

    public Carpet1(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public String toString() {
        return "Carpet1{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
public double calcCost(){
    return (length*width*unitPrice);
}
public double totalCost(){
        if(isPersian){
            return calcCost()+200;
        }else {
            return calcCost();
        }
}
}
/*
Task03:
    1. Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */