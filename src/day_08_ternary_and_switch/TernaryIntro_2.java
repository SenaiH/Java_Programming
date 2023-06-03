package day_08_ternary_and_switch;

public class TernaryIntro_2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num>0){
            result = "Positive";
        }else if(num<0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        System.out.println(result);
        System.out.println("-------------------------------------------");

        String result1 = (num>0)?"Positive":(num<0)?"Negative":"Zero";

        System.out.println(result1);
        System.out.println("-------------------------------------------------");
        int numday = 4;
        String day = "";

        String r = (numday==1)?"Monday":(numday==2)?"Tuesday":(numday==3)?"Wednesday":(numday==4)?"Thursday":(numday==5)?"Friday":(numday==6)?"Saturday":"Sunday";

        System.out.println(r);

        int numm = 12;
        //String month = "";
        String month = (numm==1)?"January":(numm==2)?"February":(numm==3)?"March":(numm==4)?"April":(numm==5)?"May"
                :(numm==6)?"June":(numm==7)?"July":(numm==8)?"August":(numm==9)?"September":(numm==10)?"October"
                :(numm==11)?"November":"December";

        System.out.println(month);
    }

}
