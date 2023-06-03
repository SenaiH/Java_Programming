package day_22_Wrapper_ArraysListIntro;

import Utilities.ArraysUtility;

public class Test {
    public static void main(String[] args) {
        int[]numbers = {10,20,30,40,50,60,70,90};

        boolean has25 = ArraysUtility.contains(numbers,25);

        System.out.println("has25 = " + has25);

        System.out.println("----------------");

        String Students[] ={"Selam","Salem","Senai"};

        System.out.println(ArraysUtility.contains(Students,"Selamawit"));

    }

}
