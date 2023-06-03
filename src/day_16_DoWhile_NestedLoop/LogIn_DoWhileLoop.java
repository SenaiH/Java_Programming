package day_16_DoWhile_NestedLoop;

import java.util.Scanner;

public class LogIn_DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String p,u;
        int attempt=3;
        do{
            System.out.println("Enter username:");
            u = input.next();

            System.out.println("Enter password:");
            p = input.next();

            attempt--;

            if(attempt==0){
                break;
            }

        }while (!(u.equals("Cydeo")&&p.equals("WoodenSpoon")));
    }

}
