package day_24_ArrayListDateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_4_RemoveSpecialChars {
    public static void main(String[] args) {

        ArrayList<Character>list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(each->!((each>='0'&&each<='9')||(each>='A'&&each<='Z')));

        System.out.println(list);
    }

}
/*
Write a program that can remove all the special characters from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			[A', 'B', '1', '2', 'C', 'D', '3', '4']
 */