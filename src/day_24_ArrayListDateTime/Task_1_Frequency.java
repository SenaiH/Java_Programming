package day_24_ArrayListDateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_1_Frequency {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        for (Integer each : list) {
            if(Collections.frequency(list,each)==1){
                System.out.println(each);
            }
        }
/*
ArrayList<Integer> uniqueNumbers = new ArrayList<>(); // create ArrayList
            uniqueNumbers.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

            uniqueNumbers.removeIf(x -> uniqueNumbers.indexOf(x) != uniqueNumbers.lastIndexOf(x));

            System.out.println(uniqueNumbers);
 */
    }

}
/*
Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops
 */