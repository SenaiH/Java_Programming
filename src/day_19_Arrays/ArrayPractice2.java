package day_19_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int [] arr1 = new int[100];
// elements 1~100;

       /* for (int i = 0,j = 1; i < arr1.length; i++,j++) {
            arr1[i]=j;
        }
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));*/

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=i+1;
        }
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        System.out.println("-------------------------------");
        // reversed 100~1;

        int arr2[] = new int[100];

        for (int i = 0, j=100;i <arr2.length; i++,j--) {
            arr2[i]=j;
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("------------------------------------------");

        for (int i = 0;i <arr2.length; i++) {
            arr2[i]=100-i;
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));

    }

}
