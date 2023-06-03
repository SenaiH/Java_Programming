package day_04_Concatenation;

public class Task9_SwapTwoVariables2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        //int z;
        x = x+y;
        y = x-y;
        x= x-y;
        System.out.println("X = "+ x +"\nY = "+y);

    }
}
/*
Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10
 */