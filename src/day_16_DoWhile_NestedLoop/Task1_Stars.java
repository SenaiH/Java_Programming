package day_16_DoWhile_NestedLoop;

public class Task1_Stars {
    public static void main(String[] args) {


        int column=1;

        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
/*
Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */