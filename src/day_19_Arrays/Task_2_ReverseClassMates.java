package day_19_Arrays;

public class Task_2_ReverseClassMates {
    public static void main(String[] args) {

        String ClassMates [] = {"Senai","Salem","Senait","Ahmed","Jawid","Naseem","Khalil","Mohammad","Selamawit","Sally"};

        for (int i = 0; i < ClassMates.length; i++) {

            String name=ClassMates[i];

            String reverse="";
            for (int j = name.length()-1; j >=0 ; j--) {
                reverse+=name.charAt(j);
            }
            System.out.println(reverse);

        }
    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */