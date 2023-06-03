package day_19_Arrays;

public class MinNumber {
    public static void main(String[] args) {
        int[]numbers = {100,20,500,40,-40,30};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("min = " + min);
    }


}
/*
Write a program that can find the minimum number from an array
 */