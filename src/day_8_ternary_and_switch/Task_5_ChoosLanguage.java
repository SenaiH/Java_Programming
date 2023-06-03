package day_8_ternary_and_switch;

public class Task_5_ChoosLanguage {
    public static void main(String[] args) {
       int num = 5;
       String result ="";
       result = (num==1)?"Hello, thank for your call":(num==2)?"Hola, gracias para llamar":(num==3)?"Merhaba, aradiginiz icin tesekkurler":(num==4)?"Privet, spasibo za vash zvonok":(num==5)?"Merci ,pour votre appel":"Invalid";

        System.out.println(result);
        System.out.println("--------------------------------------");
        String result1 = "";
        switch (num){
            case 1:
                result1="Hello, thank for your call";
                break;
            case 2:
                result1="Hola, gracias para llamar";
                break;
            case 3:
                result1="Hola, gracias para llamar";
                break;
            case 4:
                result1 ="Privet, spasibo za vash zvonok";
                break;
            case 5:
                result1="Merci ,pour votre appel";
                break;
            default:
                result1 ="Invalid!";
        }
        System.out.println(result1);
    }

}
/*
Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */