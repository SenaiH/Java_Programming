package day_20_Arrays_For_Each;

public class Task_4_UniqueElement {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 1, 2, 4, 5};

        for (int each : a1) {
            int count = 0;
            for (int num : a1) {
                if (each == num) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }

}
/*
Write a program that can display the unique elements of an array

			MUST use for each loops
 */