package day_12_CustomMethod;

public class Task_2_Capitalization {
    public static void main(String[] args) {
      capitalize("haILe","seNAi");

    }
    public static void capitalize(String firstName,String lastName){

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

    }
}

/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */