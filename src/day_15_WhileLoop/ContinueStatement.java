package day_15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if(i==4){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------");

        for (int i = 10; i <31 ; i++) {
            if(i%2!=0){
                continue; // Skips all the odd numbers between.
            }
            System.out.println(i);
       }
        System.out.println("-----------------------------------");

        for (char i = 'A'; i <= 'G'; i++) {
            if(i=='B')
                continue;
            if(i=='E')
                continue;
            System.out.println(i);
        }
        System.out.println("------------------------------");

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello World");

       // }

        System.out.println("---------------------------------");

        //Find the sum of all even numbers betwee 50~100;

        for (int i = 50; i <=100 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int j = 50; j <=100 ; j+=2) {

            System.out.print(j+" ");
            }
            System.out.println();

            for (int j = 50; j <=100 ; j++) {
                if(j%2!=0){
                    continue;
                }
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }


