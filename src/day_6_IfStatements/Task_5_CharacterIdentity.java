package day_6_IfStatements;

public class Task_5_CharacterIdentity {
    public static void main(String[] args) {
       char chr = '8';
       boolean isDigit = chr>='0' && chr <= '9';
       boolean isCharacter = (chr>='A'&&chr<='Z') || (chr>='a'&&chr<='z');
       boolean isSpecialCharacter =!isDigit&&!isCharacter;
    String result = "";
    if(isDigit){
   result = "Digit";
    }if(isCharacter){
        result = "Character";
        }if(isSpecialCharacter){
        result = "Special Character";
        }
        System.out.println(result);

    }

}
/*
Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

ch >= '0' && ch <= '9';
			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */