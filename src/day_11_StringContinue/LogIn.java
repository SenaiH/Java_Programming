package day_11_StringContinue;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String userName= input.nextLine();

        System.out.println("Enter password:");
        String passWord = input.nextLine();

        String correctUserName = "Cydeo",
                correctPassWord = "WoodenSpoon";

        input.close();

        if(userName.equals(correctUserName)&&passWord.equals(correctPassWord)){
            System.out.println("You're Logged In");
        }else{
            System.err.println("Incorrect password and username, please try again!");
        }
    }

}


/*
 Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon

 */