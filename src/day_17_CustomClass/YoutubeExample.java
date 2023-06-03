package day_17_CustomClass;

public class YoutubeExample {
    public static void main(String[] args) {

        char ch = 'A';

        for (int i = 1; i <=5 ; i++) {

            //ch = 'A';
            for (int j = 1; j <= i; j++)

                System.out.print(ch +" ");
            System.out.println();
            ch++;

            }

    }
}
/*
A
BB
CCC
DDDD
EEEEE
 */