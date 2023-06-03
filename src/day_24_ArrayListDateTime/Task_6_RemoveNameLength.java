package day_24_ArrayListDateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_6_RemoveNameLength {
    public static void main(String[] args) {

        ArrayList<String>countries = new ArrayList<>();
        countries.addAll(Arrays.asList("Eritrea","Bangladesh","Turkiye","United States of Amaerica","Ukraine","Russia","Madgascar"));

            countries.removeIf(count->count.length()>=10);
            System.out.println(countries);

    }

}
/*
6. Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater
 */