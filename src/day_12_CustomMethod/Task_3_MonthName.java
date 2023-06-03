package day_12_CustomMethod;

public class Task_3_MonthName {
    public static void main(String[] args) {
     month(2);
     month(7);
     month(12);
     month(13);
     month(0);
     month(4);

    }
    public static void month(int num){

        String month=(num>=1&&num<=12)?(num==1)?"January":(num==2)?"February":(num==3)?"March":(num==4)?"April":(num==5)?"May":(num==6)?"June":(num==7)?"July":(num==8)?"August":(num==9)?"September":(num==10)?"October":(num==11)?"November":"December":"Invalid Month";

        System.out.println(month);
    }
}



/*
Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */