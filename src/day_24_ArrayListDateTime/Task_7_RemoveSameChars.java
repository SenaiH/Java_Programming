package day_24_ArrayListDateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_7_RemoveSameChars {
    public static void main(String[] args) {

        ArrayList<String>name = new ArrayList<>();
        name.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        name.removeIf(p->p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));

        System.out.println(name);

    }

}
/*
Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Canada","Lan", "Ebrahim", "Farida"]
 */