package day_22_Wrapper_ArraysListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_3_Combine {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList<>();

        for (String each1 : arr1) {
            list.add("\""+each1+"\"");
        }
        for (String each2 : arr2) {
            list.add("\""+each2+"\"");
        }

        System.out.println("list ==> " + list);

    }

}
/*
write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */