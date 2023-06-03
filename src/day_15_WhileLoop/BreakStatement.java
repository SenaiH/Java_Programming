package day_15_WhileLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if(i==6){
                break;
            }
            System.out.println(i);
        }
        System.out.println("---------------------------------------");

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == 'J') {
                break;

            }
            System.out.print(i + " ");
        }

        System.out.println("----------------------------------");

        for(;;){
            System.out.println("Hello");
            break;
           // System.out.println("World"); // anything after break will get error.
        }

    }
}
