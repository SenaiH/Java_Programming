package day_28_OOP_Encapsulation.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Loly",3,7,true );
        Candy candy2 = new Candy("Only",3,11,true);
        Candy candy3 = new Candy("Koly",7,9,false);
        Candy candy4 = new Candy("Ice",3,1,true);
        Candy candy5 = new Candy("Lily",4,21,false);

        candy1.setPrice(6);

        ArrayList<Candy>candies = new ArrayList<>(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        System.out.println(candies);

        //for (Candy each : candies) {
          //  if(each.getBrand())

    }
}
