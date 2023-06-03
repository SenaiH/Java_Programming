package day_14_forLoop;

public class OverLoadingMainMethod {
    public static void main(String[] args) {
        System.out.println("A");
          main(25);
          main(2.3);
          main(true);

    }

    public static void main(int/*[]*/ args) {
        System.out.println("B");
    }

    public static void main(boolean/*[]*/ args) {
        System.out.println("C");
    }

    public static void main(double/*[]*/args) {
        System.out.println("D");

 // Main method can be overloaded multiple times HOWEVER is not necessary.
        //The first main method gets executed as it is from java library but the remaining
        // ones not because we created them.



        }
    }

