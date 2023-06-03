package day_22_Wrapper_ArraysListIntro;

public class Task_1_Retrieve {
    public static void main(String[] args) {
        String str = "Wooden Spoon!";

        String letters = "", digits = "", special = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)){
                letters += ch;
            } else if (Character.isDigit(ch)) {
                digits += ch;
            }else {
                special += ch;
            }
        }

        System.out.println("letters = \"" + letters +"\"");
        System.out.println("digits = \"" + digits +"\"");
        System.out.println("special = \"" + special+"\"");

    }

}
/*
Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
 */