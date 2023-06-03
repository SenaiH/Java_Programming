package day_06_IfStatements;

public class IfAndElseIntro {
    public static void main(String[] args) {
        int age = 28;
        if (age >= 21) {
            System.out.println("Eligible");
        }
        if (age < 21) {
            System.out.println("Not-Eligible");
        }

        System.out.println("------------------------");

        if (age >= 21) {
            System.out.println("Eligible");
        } else {   //Otherwise
            System.out.println("Not-Eligible");
        }
        System.out.println("---------------------------------------------");

       String result =(age >= 21)? "Eligible":"Not-Eligible";
        System.out.println(result);
    }


}
