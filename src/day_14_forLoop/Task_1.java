package day_14_forLoop;

public class Task_1 {
    public static void main(String[] args) {
        starShape(6,8);

        }
    public static void starShape(int rows,int column){
        //char star = '*';
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <=column; j++) {
                System.out.print("* ");
            }
           System.out.println();
        }

    }

}
/*
 Use a loop to print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */


