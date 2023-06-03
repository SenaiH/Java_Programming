package day_23_ArrayListCollectionUtli;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_6_MultiplyBy2 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
         //int num = 2;
        for (Integer each : list) {
            if(each%2!=0){
                each*=2;

            }
            System.out.print(each+" ,");
        }

    }

}
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */