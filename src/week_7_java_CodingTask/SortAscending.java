package week_7_java_CodingTask;

import java.util.ArrayList;

public class SortAscending {
    public static void main(String[] args) {

    }
    public int[] Sort(int[] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);
        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }
    public int findMin(ArrayList<Integer> a) {
        int min = Integer.MAX_VALUE;
        for (int each : a)
            min = Math.min(min, each);
        return min;

    }
}
/*
Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */