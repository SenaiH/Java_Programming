package day_19_Arrays;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {10, 20, 30, 40, 50};

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));


        System.out.println("-------------------------------------");

   String[]days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

       int n = 1;
        System.out.println(days[n-1]);

        System.out.println("-------------------------------------");

        String[]months = {"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sep","Oct","Nov","Dec"};

        int n2 = 1;

        System.out.println(months[n2-1]);
        System.out.println("Months" + Arrays.toString(months));

        for (int i = months.length-1; i >=0; i--) {
            System.out.println(months[i]);
        }

    }
}
