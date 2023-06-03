package day_19_Arrays;
import java.util.Arrays;
public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[6];
        myGroup[0] = "Senait";
        myGroup[1] = "Salem";
        myGroup[2] = "Selamawit";
        myGroup[3] = "Senai";
        myGroup[4] = "Ruth";
        myGroup[myGroup.length - 1] = "Sumeye";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzat";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-------------------------");

        for (int i = 0; i < 6; i++) {
            System.out.print(myGroup[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------");

        //Reversed Order

        for (int i = myGroup.length - 1; i>=0; i--) {

            System.out.println(myGroup[i] +"");
        }

        System.out.println("-------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }




    }
}
