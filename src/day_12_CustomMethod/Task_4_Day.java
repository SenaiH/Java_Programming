package day_12_CustomMethod;

public class Task_4_Day {
    public static void main(String[] args) {
      day(1);
      day(8);
      day(5);
      day(3);
      day(7);
      day(0);

    }
    public static void day(int num){

        String day = (num>=1&&num<=7)?(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday":"Sunday":"Invalid Day";

        System.out.println(day);
    }

}
/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */