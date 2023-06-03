package day_08_ternary_and_switch;

public class Task1_NumberToWord {
    public static void main(String[] args) {
  int num =0;
  String result ="";
  result =(num<=9&&num>=0)?(num==0)?"Zero":(num==1)?"One":(num==2)?"Two":(num==3)?"Three":(num==4)?"Four":(num==5)?"Five"
          :(num==6)?"Six" :(num==7)?"Seven":(num==8)?"Eight":"Nine":"Invalid";

        System.out.println(result);
    }
}
/*
Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
 */