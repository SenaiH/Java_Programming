package day_23_ArrayListCollectionUtli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_5_MoveZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int count = Collections.frequency(list, 0);
        list.removeAll(Arrays.asList(0));
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        System.out.println(list);

    }

}
/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */