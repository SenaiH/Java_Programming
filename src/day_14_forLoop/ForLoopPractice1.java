package day_14_forLoop;

public class ForLoopPractice1 {
    public static void main(String[] args) {
        //sum of all numbers between 1 an 100;

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("-----------------------------");
        // print all letters A-Z.
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        // PRINT ALL LETTERS BACKWOAR.
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");

        }
    }
}
