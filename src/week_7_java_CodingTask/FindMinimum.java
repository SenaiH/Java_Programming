package week_7_java_CodingTask;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinimum {
    public static void main(String[] args) {

    }

    public int maxValue( int[] n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    public int maxValue1( int[] n ) {
        Arrays.sort( n );
        return n [ 0 ];
}}
/*
Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */