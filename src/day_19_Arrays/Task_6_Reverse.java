package day_19_Arrays;

import java.util.Arrays;

public class Task_6_Reverse {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[]reversed = new int[array.length];

        for (int  i = array.length-1,j=0;i >=0; i--,j++) {
            reversed[j]=array[i];
        }
        System.out.println(Arrays.toString(reversed));

    }

}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */