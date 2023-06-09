package day_24_ArrayListDateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_5_SecondMaxNum {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        int max = Collections.max(list);
        int min = Collections.min(list);

        list.removeIf(p->p==max||p==min);

        int max2 = Collections.max(list);
        int min2 = Collections.min(list);


        System.out.println("Second Max is:  = " + max2);
        System.out.println("Second Min is:  = " + min2);
    }

}
/*
Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */