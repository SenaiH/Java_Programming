package day_25_DateTimeContnueConstructorIntro;

public class Pizzac {
public char size;
public int numberOfCheeseTopping;
public int numberOfPepperoniTopping;

    public Pizzac(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
 public void calcCost(char size){
        if(size=='S'){
            System.out.println("The cost is : $10 + $2 per topping");
        }if(size=='M'){
         System.out.println("The cost is : $12 + $2 per topping");
     }if(size=='L'){
         System.out.println("The cost is : $14 + $2 per topping");
     }
 }
}
/*
Task01:
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */