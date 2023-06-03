package day_04_Concatenation;

public class Task4CarInformation {
    public static void main(String[] args) {
        int year = 2022,
                miles = 20_000,
                price = 30_000;
        String make = "Honda",
                model = "Ex",
                color = "Silver";

        System.out.println(year + " " + make + " " + model + ", " + miles + " miles," + " " + color + ", $" + price);
    }

}
/*
2. Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $
 */