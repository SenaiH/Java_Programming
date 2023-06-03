package day_8_ternary_and_switch;

public class SwitchMonthName {
    public static void main(String[] args) {
       int num = 2;
       String result = "";

       switch(num){
           case 1:
               result = "January";
               break;
           case 2:
               result = "February";
               break;
           case 3:
               result = "March";
               break;
           case 4:
               result = "April";
               break;
           case 5:
               result = "May";
               break;
           case 6:
               result = "June";
               break;
           case 7:
               result = "July";
               break;
           case 8:
               result= "August";
           case 9:
               result = "September";
               break;
           case 10:
               result = "October";
               break;
           case 11:
               result = "November";
               break;
           case 12:
               result = "December";
               break;
           default:
               result = "Invalid";
       }

        System.out.println(result);

    }

}
