package day_16_DoWhile_NestedLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String u = input.next();

        System.out.println("Enter password:");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("You're Logged In");
        }else{
            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter userename:");
                u = input.next();

                System.out.println("Enter password:");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("You're now Logged in");
                    break;
                }
            }
         if(!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
             System.err.println("Your account is locked, please contact support team!");
         }
        }
      input.close();
    }
   /* public static void CydeoLoggin(String username,String password){
        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You're Logged In");
    }else{
            System.err.println("Invalid");  =====>  For only one time attempt.
        }*/

}
/*
Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is locked."
 */