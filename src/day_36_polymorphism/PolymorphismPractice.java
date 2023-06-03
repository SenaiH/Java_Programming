package day_36_polymorphism;

import day_30_InheritanceContinue.phoneTask.Iphone;
import day_30_InheritanceContinue.phoneTask.Nokia;
import day_30_InheritanceContinue.phoneTask.Phone;
import day_30_InheritanceContinue.phoneTask.Samsung;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", "Black", 900),
                new Iphone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new Iphone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new Iphone("Iphone 12 Pro", "Large", "Black", 1200),
                new Iphone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new Iphone("Iphone 6", "Smalle", "Gold", 400),
                new Iphone("Iphone 7", "Smalle", "White", 500)
        };

        for(Phone eachPhone:phones){
            System.out.println(eachPhone.getModel() +"-"+eachPhone.getColor()+"-"+eachPhone.getPrice());
        }
int countIphone = 0,
        countSamsung=0;
        for(Phone eachPhone:phones){
            if(eachPhone instanceof Iphone){
                countIphone++;
            }
        }
        System.out.println(countIphone);

        for(Phone eachPhone:phones){
            if(eachPhone instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println(countSamsung);

        System.out.println("---------------------------------------------------------");

        for (Phone each : phones) {
            if( each instanceof Iphone || each instanceof Samsung){ // if the phone is Iphone or samsung
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }
    }
}
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater

 */